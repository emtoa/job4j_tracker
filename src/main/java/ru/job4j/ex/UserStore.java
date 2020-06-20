package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;

            for(int i = 0; i < users.length; i++){
                if (users[i].getUsername().equals(login)) {
                    rsl = users[i];
                }
            }

            if (rsl == null) {
                throw new UserNotFoundException("User don't find !!! ");
            }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() == false || user.getUsername().length() < 3 ) {
            throw new UserInvalidException("User don't valid !!! ");
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException usinv){
            usinv.printStackTrace();
        } catch (UserNotFoundException usnf){
            usnf.printStackTrace();
        }
    }
}