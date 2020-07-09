package myself.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ru.job4j.bank.Account;
import ru.job4j.bank.BankService;
import ru.job4j.bank.User;
import ru.job4j.search.*;
import ru.job4j.tracker.Item;

import java.util.HashMap;
import java.util.Map;

public class Test7 {

    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        String requisite = "3fdsbb9";
        accounts.add(new Account("3fdsbb9", 130));
        accounts.add(new Account("wwwwwww", 420));
        int index = accounts.indexOf(new Account(requisite, -1));
        Account find = accounts.get(index);
        System.out.println(find.getRequisite() + " -> " + find.getBalance());
    }
}