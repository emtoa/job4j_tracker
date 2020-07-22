package ru.job4j.bank;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        this.users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {

        Optional<User> user = findByPassport(passport);

        if (user.isPresent()) {
            List<Account> list = this.users.get(user.get());
            if (list.indexOf(account) == -1) {
                list.add(account);
            }
        }
    }

    public Optional<User> findByPassport(String passport) {

        return this.users.keySet().stream()
                .filter(usr -> usr.getPassport().equals(passport))
                .findFirst();
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {

        Optional<User> user = findByPassport(passport);

        if (user.isEmpty()) {
            return null;
        }

        return this.users.get(user.get()).stream()
                .filter(t -> t.equals(new Account(requisite, -1)))
                .findAny();

    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String dstPassport, String dstRequisite, double amount) {
        boolean rsl = false;

        Optional<Account> srcAccount =  findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount =  findByRequisite(dstPassport, dstRequisite);

        if (srcAccount != null && destAccount != null) {

            if (srcAccount.get().getBalance() >= amount) {
                srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
                destAccount.get().setBalance(destAccount.get().getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        BankService bank = new BankService();
        bank.addUser(new User("321", "Petr Arsentev"));
        Optional<User> user = bank.findByPassport("3211");
        if (user.isPresent()) {
            System.out.println(user.get().getUsername());
        }
    }
}