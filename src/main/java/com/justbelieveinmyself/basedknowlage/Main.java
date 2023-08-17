package com.justbelieveinmyself.basedknowlage;

import com.justbelieveinmyself.basedknowlage.entity.User;

public class Main {
    private static final UserHelper userHelper = new UserHelper();
    public static void main(String[] args) {

    // LOAD VS GET -> get fetch object now, but load fetch object when it needed -------<
    // if object null throws NullPointer exc for get AND ObjectNotFound exc for load


//        System.out.println("-------------------------------------------");
//        System.out.println("+---SAVE NEW USERs---+");
//        User newUser = new User();
//        newUser.setName("Ilya");
//        newUser.setPassword("mypas12");
//        userHelper.saveUser(newUser);
//
//        User newUser1 = new User();
//        User newUser2 = new User();
//        User newUser3 = new User();
//        newUser1.setName("Vadim");
//        newUser2.setName("Dmitry");
//        newUser3.setName("Alex");
//        newUser1.setPassword("323fsdgf");
//        newUser2.setPassword("gsdbdfhq");
//        newUser3.setPassword("GSDGRWDfsd52");
//        userHelper.saveUser(newUser1);
//        userHelper.saveUser(newUser2);
//        userHelper.saveUser(newUser3);




        System.out.println("-------------------------------------------");
        System.out.println("+---FIND ALL USERS---+");
        for (User user : userHelper.getUserList()) {
            System.out.println(user);
        }
        System.out.println("-------------------------------------------");

        System.out.println("+---FIND USER BY ID---+");
        int id = 3;
        System.out.println(userHelper.getUserById(id));
        System.out.println("-------------------------------------------");

        System.out.println("+---FIND USER BY NAME---+");
        String name = "Ilya";
        for (User user : userHelper.getUsersByName(name)) {
            System.out.println(user);
        }
        System.out.println("-------------------------------------------");



    }
}
