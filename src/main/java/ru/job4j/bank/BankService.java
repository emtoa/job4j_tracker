package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
            this.users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);

        if (user != null) {
            List<Account> list = this.users.get(user);
            if (list.indexOf(account) == -1) {
                list.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user: this.users.keySet()) {
            if (user.getPassport().equals(passport)){
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);

        if (user != null){
            List<Account> l = this.users.get(user);
            int index = l.indexOf(new Account(requisite, -1));
                return  index != -1 ? l.get(index) : null;
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dеstRequisite, double amount) {
        boolean rsl = false;

        Account srcAccount =  findByRequisite(srcPassport, srcRequisite);
        Account destAccount =  findByRequisite(destPassport, dеstRequisite);

        if (srcAccount != null && destAccount != null) {

            if (srcAccount.getBalance() >= amount) {
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                destAccount.setBalance(destAccount.getBalance() + amount);
                rsl = true;
            }
        }

        return rsl;
    }
}