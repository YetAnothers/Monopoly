package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static com.company.Players.*;


public class Monopoly {
    public static void main(String[] args) {

//        Field [] field = new Field[40];


//
//        System.out.println("diceOne "+dOne);
//        System.out.println("diceTwo "+dTwo);
//        System.out.println("throwDices "+throwDices());
//        System.out.println("movingMethod "+moving());
//        System.out.println("returnMove "+moving);

        boolean go=true;
        if (go) insertPlayers();
        //System.out.println("yes_no "+yes_no);
        if (go_go) {
            System.out.println("FOLLOW THE NEXT QUEUE " + Arrays.toString(def_names));
//            if (numberOfPlayers >= 2 && def_names[numberOfPlayers - 1] != null)
            players_create();
            Field.field_create();
            Chance.chance_create();
            shuffleArray(Chance.chance);
            CommunityChest.communityChest_create();
            shuffleArray(CommunityChest.communityChest);

            //shuffleArray(CommunityChest.suffled_communityChest);
//            System.out.println(Chance.chance[0]);
//            if(Chance.chance[0].charAt(0)=='0')System.out.println(Chance.chance[0]);
//            System.out.println(Arrays.toString(Chance.chance));
//            shuffleArray(Chance.suffled_chance);
//            System.out.println(Arrays.toString(Chance.suffled_chance));
//            if(Chance.suffled_chance[0].charAt(0)=='0')System.out.println(Chance.chance[0]);
//            //System.out.println(Chance.chance[0]);
//            System.out.println(Arrays.toString(Chance.chance));
            //System.out.println(Chance.chance[0]);

//            System.out.println(Arrays.toString(CommunityChest.communityChest));
            //turn=numberOfPlayers;
            players_increment = numberOfPlayers;

            turn = (byte)(players_increment-1);
            //(byte)(numberOfPlayers-1);
            //if (players_increment < 1){turn=(byte)(players_increment-1);}
            move();
//            do {
//               // turning();
//                move();
//            }
//
//
//                while(numberOfPlayers-players_increment<numberOfPlayers-turn);{
//                //move();
//                }


//
//            players[0].account = 1023;
//            players[2].account = 103;
//            players[1].account += 100;
//
//            System.out.println(def_names[0] + " " + players[0].account + "");
//            System.out.println(def_names[1] + " " + players[1].account + " ");
//            System.out.println(def_names[1] + " " + players[1].position + " ");
//            System.out.println(def_names[1] + " " + players[1].isBankrupted + " ");
//            System.out.println(def_names[1] + " " + players[1].chanceCard + " " + players[1].commChestCard + "");
//            System.out.println(def_names[4] + " " + players[4].account + " ");
//            System.out.println(def_names[5] + " " + players[5].account + " ");
//            if (0 == 0) {
//                players[5].players_status(players[5]);
//            }
//            if (0 == 0) {
//                players[0].players_status(players[0]);
//            }






            //Field f1 = new Field("Street 1",players[1].name);
            //System.out.println(f1.owner);

        }
    }
}

class Field{
    String title;
    short purchase;
    char label;
    short mortgage; // размер получаемого залога
    short defaultRent;
    short h1Rent;
    short h2Rent;
    short h3Rent;
    short h4Rent;
    short hotelRent;
    short houseBuild;
    short hotelBuild;
    byte location;
    boolean isMortgaged; // заложена ли клетка
    boolean isDeveloped; //есть ли дом-(а)
    boolean isDevelopedWithHotel; //есть ли отель
    boolean isLabelled; // собрана ли улица
    boolean isOwned; // в собственности ли
    String owner;
    String action;
    byte houseQuantity=32;
    byte hotelQuantity=12;
    boolean isAsset;
    boolean isStreet;



    Field(String title, byte location, short purchase, short mortgage, short defaultRent, short h1Rent, short h2Rent, short h3Rent, short h4Rent, short hotelRent, short houseBuild, short hotelBuild, byte houseQuantity, byte hotelQuantity, char label, boolean isMortgaged, boolean isDeveloped, boolean isDevelopedWithHotel, boolean isLabelled, boolean isOwned, String owner, boolean isAsset, boolean isStreet){
        this.title=title;
        this.purchase=purchase;
        this.label=label;
        this.mortgage=mortgage;
        this.defaultRent=defaultRent;
        this.h1Rent=h1Rent;
        this.h2Rent=h2Rent;
        this.h3Rent=h3Rent;
        this.h4Rent=h4Rent;
        this.hotelRent=hotelRent;
        this.houseBuild=houseBuild;
        this.hotelBuild=hotelBuild;
        this.location=location;
        this.isMortgaged=isMortgaged;
        this.isDeveloped=isDeveloped;
        this.isDevelopedWithHotel=isDevelopedWithHotel;
        this.isLabelled=isLabelled;
        this.isOwned=isOwned;
        this.owner=owner;
        this.houseQuantity=houseQuantity;
        this.hotelQuantity=hotelQuantity;
        this.isAsset=isAsset;
        this.isStreet=isStreet;
    }
    Field(String title, byte location, String action, boolean isAsset){
        this.title=title;
        this.location=location;
        this.action=action;
        this.isAsset=isAsset;
    }
    Field(String title, byte location, short purchase, short mortgage, short defaultRent, char label, boolean isOwned, boolean isMortgaged, boolean isLabelled, String owner, boolean isAsset){
        this.title=title;
        this.location=location;
        this.purchase=purchase;
        this.label=label;
        this.mortgage=mortgage;
        this.defaultRent=defaultRent;
        this.isMortgaged=isMortgaged;
        this.isLabelled=isLabelled;
        this.isOwned=isOwned;
        this.owner=owner;
        this.isAsset=isAsset;
    }
    Field(String title, byte location, short purchase, short mortgage, short defaultRent, char label, boolean isOwned, boolean isMortgaged, String owner, boolean isAsset){
        this.title=title;
        this.location=location;
        this.purchase=purchase;
        this.label=label;
        this.mortgage=mortgage;
        this.defaultRent=defaultRent;
        this.isMortgaged=isMortgaged;
        this.isOwned=isOwned;
        this.owner=owner;
        this.isAsset=isAsset;
    }

    static Field [] field;
    static Field [] field_create(){
        field = new Field[40];
        field [0] = new Field("START", (byte) 0, " $200 acquired", false);
        field [2] = new Field("COMMUNITY CHEST", (byte) 2, "get some commChestCard", false);
        field [4] = new Field("INCOME TAX", (byte) 4, "no pay -$200, no game", false);
        field [7] = new Field("CHANCE", (byte) 7, "get some chanceCard", false);
        field [10] = new Field("PRISON", (byte) 10, "take it easy", false);
        field [17] = new Field("COMMUNITY CHEST", (byte) 17, "get some commChestCard", false);
        field [20] = new Field("FREE PARKING", (byte) 20, "meditate", false);
        field [22] = new Field("CHANCE", (byte) 22, "get some chanceCard", false);
        field [30] = new Field("JAIL", (byte) 30, "go to prison", false);
        field [33] = new Field("COMMUNITY CHEST", (byte) 33, "get some commChestCard", false);
        field [36] = new Field("CHANCE", (byte) 36, "get some chanceCard", false);
        field [38] = new Field("LUXURY TAX", (byte) 38, "no pay -$100, no game", false);

        field [5] = new Field("SUBWAY", (byte) 5, (short) 200, (byte) 100, (byte) 25, 't', false, false, null, true);
        field [15] = new Field("RAILWAY", (byte) 15, (short) 200, (byte) 100, (byte) 25, 't', false, false, null, true);
        field [25] = new Field("PORT", (byte) 25, (short) 200, (byte) 100, (byte) 25, 't', false, false, null, true);
        field [35] = new Field("AIRPORT", (byte) 35, (short) 200, (byte) 100, (byte) 25, 't', false, false, null, true);

        field [12] = new Field("ELECTRIC UTILITY", (byte) 12, (short) 150, (byte) 75, (byte) 4, 'u', false, false, false, null, true);
        field [28] = new Field("WATER UTILITY", (byte) 28, (short) 150, (byte) 75, (byte) 4, 'u', false, false, false, null, true);


        field [1] = new Field("MEDITERRANEAN AVENUE", (byte) 1, (short) 60, (short) 30, (short) 2, (short) 10, (short) 30, (short) 90, (short) 160, (short) 250, (short) 50, (short) 50, (byte) 0, (byte) 0, 'b', false, false, false, false, false, null, true, true);
        field [3] = new Field("BALTIC AVENUE", (byte) 3, (short) 60, (short) 30, (short) 4, (short) 20, (short) 60, (short) 180, (short) 320, (short) 450, (short) 50, (short) 50, (byte) 0, (byte) 0, 'b', false, false, false, false, false, null, true, true);

        field [6] = new Field("ORIENTAL AVENUE", (byte) 6, (short) 100, (short) 50, (short) 6, (short) 30, (short) 90, (short) 270, (short) 400, (short) 550, (short) 50, (short) 50, (byte) 0, (byte) 0, 'a', false, false, false, false, false, null, true, true);
        field [8] = new Field("VERMONT AVENUE", (byte) 8, (short) 100, (short) 50, (short) 6, (short) 30, (short) 90, (short) 270, (short) 400, (short) 550, (short) 50, (short) 50, (byte) 0, (byte) 0, 'a', false, false, false, false, false, null, true, true);
        field [9] = new Field("CONNECTICUT AVENUE", (byte) 9, (short) 120, (short) 60, (short) 8, (short) 40, (short) 100, (short) 300, (short) 450, (short) 600, (short) 50, (short) 50, (byte) 0, (byte) 0, 'a', false, false, false, false, false, null, true, true);

        field [11] = new Field("ST. CHARLES PLACE", (byte) 11, (short) 140, (short) 70, (short) 10, (short) 50, (short) 150, (short) 450, (short) 625, (short) 750, (short) 100, (short) 100, (byte) 0, (byte) 0, 'p', false, false, false, false, false, null, true, true);
        field [13] = new Field("STATES AVENUE", (byte) 13, (short) 140, (short) 70, (short) 10, (short) 50, (short) 150, (short) 450, (short) 625, (short) 750, (short) 100, (short) 100, (byte) 0, (byte) 0, 'p', false, false, false, false, false, null, true, true);
        field [14] = new Field("VIRGINIA AVENUE", (byte) 14, (short) 140, (short) 80, (short) 12, (short) 60, (short) 180, (short) 500, (short) 700, (short) 900, (short) 100, (short) 100, (byte) 0, (byte) 0, 'p', false, false, false, false, false, null, true, true);

        field [16] = new Field("ST. JAMES PLACE", (byte) 16, (short) 180, (short) 90, (short) 14, (short) 70, (short) 200, (short) 550, (short) 750, (short) 950, (short) 100, (short) 100, (byte) 0, (byte) 0, 'o', false, false, false, false, false, null, true, true);
        field [18] = new Field("TENNESSEE AVENUE", (byte) 18, (short) 180, (short) 90, (short) 14, (short) 70, (short) 200, (short) 550, (short) 750, (short) 950, (short) 100, (short) 100, (byte) 0, (byte) 0, 'o', false, false, false, false, false, null, true, true);
        field [19] = new Field("NEW YORK AVENUE", (byte) 19, (short) 200, (short) 100, (short) 16, (short) 80, (short) 220, (short) 600, (short) 800, (short) 1000, (short) 100, (short) 100, (byte) 0, (byte) 0, 'o', false, false, false, false, false, null, true, true);

        field [21] = new Field("KENTUCKY AVENUE", (byte) 21, (short) 220, (short) 110, (short) 18, (short) 90, (short) 250, (short) 700, (short) 875, (short) 1050, (short) 150, (short) 150, (byte) 0, (byte) 0, 'r', false, false, false, false, false, null, true, true);
        field [23] = new Field("INDIANA AVENUE", (byte) 23, (short) 220, (short) 110, (short) 18, (short) 90, (short) 250, (short) 700, (short) 875, (short) 1050, (short) 150, (short) 150, (byte) 0, (byte) 0, 'r', false, false, false, false, false, null, true, true);
        field [24] = new Field("ILLINOIS AVENUE", (byte) 24, (short) 240, (short) 120, (short) 20, (short) 100, (short) 300, (short) 750, (short) 925, (short) 1100, (short) 150, (short) 150, (byte) 0, (byte) 0, 'r', false, false, false, false, false, null, true, true);

        field [26] = new Field("ATLANTIC AVENUE", (byte) 26, (short) 260, (short) 130, (short) 22, (short) 110, (short) 330, (short) 800, (short) 975, (short) 1150, (short) 150, (short) 150, (byte) 0, (byte) 0, 'y', false, false, false, false, false, null, true, true);
        field [27] = new Field("VENTNOR AVENUE", (byte) 27, (short) 260, (short) 130, (short) 22, (short) 110, (short) 330, (short) 800, (short) 975, (short) 1150, (short) 150, (short) 150, (byte) 0, (byte) 0, 'y', false, false, false, false, false, null, true, true);
        field [29] = new Field("MARVIN GARDENS", (byte) 29, (short) 280, (short) 140, (short) 24, (short) 120, (short) 360, (short) 850, (short) 1025, (short) 1200, (short) 150, (short) 150, (byte) 0, (byte) 0, 'y', false, false, false, false, false, null, true, true);

        field [31] = new Field("PACIFIC AVENUE", (byte) 31, (short) 300, (short) 150, (short) 26, (short) 130, (short) 390, (short) 900, (short) 1100, (short) 1275, (short) 200, (short) 200, (byte) 0, (byte) 0, 'g', false, false, false, false, false, null, true, true);
        field [32] = new Field("NORTH CAROLINA AVENUE", (byte) 32, (short) 300, (short) 150, (short) 26, (short) 130, (short) 390, (short) 900, (short) 1100, (short) 1275, (short) 200, (short) 200, (byte) 0, (byte) 0, 'g', false, false, false, false, false, null, true, true);
        field [34] = new Field("PENNSYLVANIA AVENUE", (byte) 34, (short) 320, (short) 160, (short) 28, (short) 150, (short) 450, (short) 1000, (short) 1200, (short) 1400, (short) 200, (short) 200, (byte) 0, (byte) 0, 'g', false, false, false, false, false, null, true, true);

        field [37] = new Field("PARK PLACE", (byte) 37, (short) 350, (short) 175, (short) 35, (short) 175, (short) 500, (short) 1100, (short) 1300, (short) 1500, (short) 200, (short) 200, (byte) 0, (byte) 0, 's', false, false, false, false, false, null, true, true);
        field [39] = new Field("BOARDWALK", (byte) 39, (short) 400, (short) 200, (short) 50, (short) 200, (short) 600, (short) 1400, (short) 1700, (short) 2000, (short) 200, (short) 200, (byte) 0, (byte) 0, 's', false, false, false, false, false, null, true, true);
        //Field f0 = new Field("Start",200,'n');
        return field;
    }

    static void field_info(Field f){
        System.out.println(f.title+" costs $"+f.purchase+", ordinary rent $"+f.defaultRent+", label "+f.label);
    }
    static void field_info_street(Field f){
        System.out.println(f.title+" costs $"+f.purchase+", ordinary rent $"+f.defaultRent+", house build expenses $"+f.houseBuild+", 1 house rent $"+f.h1Rent+", label "+f.label);
    }
    static void full_field_info(Field f){
        System.out.println(f.title+" costs $"+f.purchase+", ordinary rent $"+f.defaultRent+", house build expenses $"+f.houseBuild+", 1 house rent $"+f.h1Rent+", 2 houses rent $"+f.h2Rent+", 3 houses rent $"+f.h3Rent+", 4 houses rent $"+f.h4Rent+", hotel rent $"+f.hotelRent+", label "+f.label);
    }
    static void field_mortgaged(Field f){
        System.out.println(f.title+" is mortgaged ("+f.isMortgaged+") by "+f.owner);
    }

}


class Chance{
   static byte all=16,tos=17;
   static String [] chance;
   static String [] chance_create() {
       chance = new String[16];
       chance [0]= "a_Advance to START. Collect $200";
       chance [1]= "b_Advance to ILLINOIS AVENUE";
       chance [2]= "c_Advance to ST. CHARLES PLACE. If you pass START, collect $200";
       chance [3]= "d_Advance token to nearest UTILITY. If unowned, you may buy it from the Bank. If owned, throw dice and pay owner a total 10 times the amount thrown";
       chance [4]= "e_Advance token to the nearest TRANSPORTATION and pay owner twice the rental to which he/she is otherwise entitled. If Railroad is unowned, you may buy it from the Bank";
       chance [5]= "f_Bank pays you dividend of $50";
       chance [6]= "g_Get out of PRISON Free. This card may be kept until needed or sold";
       chance [7]= "h_Go Back Three 3 Spaces";
       chance [8]= "i_Go to PRISON. Go directly to PRISON. Do not pass START. Do not collect $200";
       chance [9]= "j_Make general repairs on all your property: For each house pay $25, For each hotel pay $100";
       chance [10]= "k_Pay poor tax of $15";
       chance [11]= "l_Take a ride on the SUBWAY. If you pass START, collect $200";
       chance [12]= "m_Take a walk on the BOARDWALK. Advance token to BOARDWALK";
       chance [13]= "n_You have been elected Chairman of the Board. Pay each player $50";
       chance [14]= "o_Your building and loan matures. Collect $150";
       chance [15]= "p_You have won a crossword competition. Collect $100";
       return chance;
   }
   static String pop_chance(){
       --tos;
       if (tos==0){
           shuffleArray(chance);
           tos=17;
           pop_chance();
       }
       return chance[all-tos];
   }
}
class CommunityChest {
    static byte all=17,tos=18;
   static String [] communityChest;
    static String [] communityChest_create(){
        communityChest = new String[17];
        communityChest [0]= "a_Advance to START. Collect $200";
        communityChest [1]= "b_Bank error in your favor. Collect $200";
        communityChest [2]= "c_You have won second prize in a beauty contest. Collect $10";
        communityChest [3]= "d_Doctor's fee. Pay $50";
        communityChest [4]= "e_From sale of stock you get $50";
        communityChest [5]= "f_Get Out of PRISON Free. This card may be kept until needed or sold";
        communityChest [6]= "g_Go to PRISON. Go directly to PRISON. Do not pass START, do not collect $200";
        communityChest [7]= "h_Grand Opera Night. Collect $50 from every player";
        communityChest [8]= "i_Holiday Fund matures. Collect $100";
        communityChest [9]= "j_Income tax refund. Collect $20";
        communityChest [10]= "k_It's your birthday. Collect $10 from every player";
        communityChest [11]= "l_Life insurance matures. Collect $100";
        communityChest [12]= "m_Pay hospital fees of $100";
        communityChest [13]= "n_Pay school fees of $150";
        communityChest [14]= "o_Receive $25 consultancy fee";
        communityChest [15]= "p_You are assessed for street repairs: Pay $40 per house and $115 per hotel you own";
        communityChest [16]= "q_You inherit $100";
        return communityChest;
    }

    static String pop_communityChest(){
        --tos;
        if (tos==0){
            shuffleArray(communityChest);
            tos=18;
            pop_communityChest();
        }
        return communityChest[all-tos];
    }
}


class Players {
    static byte moving = 0;
    static byte dOne = 0;
    static byte dTwo = 0;

    static byte throwDices() {
        dOne = (byte) 3;// Math.floor(1+Math.random()*6);
        dTwo = (byte) 2;// Math.floor(1+Math.random()*6);
        moving = (byte) (dOne + dTwo);
        return moving;
    }

    static byte numberOfPlayers = 0;
    static byte yes_no;
    static String[] def_names;
    short account;
    String name;
    byte position;
    byte luckCount;
    boolean isBankrupted;
    boolean chanceCard;
    boolean commChestCard;
    static boolean go_go = true;
    boolean isPrisoner;
    byte prisonBreakCount;
    short auction;
    boolean inAuction;

    Players(String name, short account, byte position, byte luckCount, boolean isBankrupted, boolean chanceCard, boolean commChestCard, boolean isPrisoner, byte prisonBreakCount, short auction, boolean inAuction) {
        this.name = name;
        this.account = account;
        this.position = position;
        this.chanceCard = chanceCard;
        this.commChestCard = commChestCard;
        this.luckCount = luckCount;
        this.isBankrupted = isBankrupted;
        this.isPrisoner=isPrisoner;
        this.prisonBreakCount=prisonBreakCount;
        this.auction=auction;
        this.inAuction=inAuction;
    }

    static Players[] players;

    static Players[] players_create() {
        players = new Players[numberOfPlayers];
        for (byte i = 0; i < numberOfPlayers; i++) {
            players[i] = new Players(def_names[i], (short) 1500, (byte) 0, (byte) 0, false, true, true, false,(byte)0,(short)0,true);
        }
        help();
        greeting();
        return players;
    }

    static void players_status(Players o) {
        System.out.println("Gambler " + o.name + " has $" + o.account + ", located at " + o.position + ", bankrupted " + o.isBankrupted + ", has ChanceCard " + o.chanceCard + ", has chestCard " + o.commChestCard+" is prisoner "+o.isPrisoner+" luckCount "+o.luckCount);
    }

    static void greeting() {
        System.out.println("\nOnly one is winner, the rest are playmates.\n");
    }

    static void help() {
        System.out.println("\ntype in \"help\" to get this help type in \"throw\" to move\ntype in \"save\" to save the game  type in \"load\" to load the game\ntype in \"asset\" to get list of your assets\ntype in \"done\" to pass the queue type in \"retire\" to leave the game type in \"quit\" to end with game\ntype in \"status\"to get your status type in \"info\"to get property info");
    }


    static void field_hosted_info() {
        System.out.println(players[numberOfPlayers - players_increment].name + " at  field " + Field.field[players[numberOfPlayers - players_increment].position].location + " " + Field.field[players[numberOfPlayers - players_increment].position].title);
    }
    static void asset(){
        for (byte i=0;i<Field.field.length;) {
            if(Field.field[i].isAsset) {
                    if (Field.field[i].isOwned && Field.field[i].owner.equals(players[numberOfPlayers - players_increment].name)){
                        System.out.println(Field.field[i].title+" your asset labelled "+Field.field[i].isLabelled+", house(s) "+Field.field[i].houseQuantity+", hotel "+Field.field[i].hotelQuantity); }
            }
            i++;
        }
    }
    static boolean check_Asset() {
        if (!Field.field[Field.field[players[numberOfPlayers - players_increment].position].location].isAsset) {
            take_passive_action();
            return false;
        } else {
            check_mortgage();
            return true;
        }
    }
    static void take_passive_action(){
        if(Field.field[players[numberOfPlayers - players_increment].position].location==0){
            System.out.println(players[numberOfPlayers - players_increment].name+ " at "+Field.field[0].title+" "+Field.field[0].action);
        } else if (Field.field[players[numberOfPlayers - players_increment].position].location==4){
            System.out.println(players[numberOfPlayers - players_increment].name+ " at "+Field.field[4].title+" "+Field.field[4].action);
            players[numberOfPlayers - players_increment].account-=200;

        } else if (Field.field[players[numberOfPlayers - players_increment].position].location==38){
            System.out.println(players[numberOfPlayers - players_increment].name+ " at "+Field.field[38].title+" "+Field.field[38].action);
            players[numberOfPlayers - players_increment].account-=100;
        } else if (Field.field[players[numberOfPlayers - players_increment].position].location==2||Field.field[players[numberOfPlayers - players_increment].position].location==17||Field.field[players[numberOfPlayers - players_increment].position].location==33){
            System.out.println(players[numberOfPlayers - players_increment].name+ " at "+Field.field[2].title+" "+Field.field[2].action);
            CommunityChest.pop_communityChest();
            System.out.println(CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos]);
            take_communityChest_action();
        } else if (Field.field[players[numberOfPlayers - players_increment].position].location==7||Field.field[players[numberOfPlayers - players_increment].position].location==22||Field.field[players[numberOfPlayers - players_increment].position].location==36){
            System.out.println(players[numberOfPlayers - players_increment].name+ " at "+Field.field[7].title+" "+Field.field[7].action);
            Chance.pop_chance();
            System.out.println(Chance.chance[Chance.all-Chance.tos]);
            take_chance_action();
        } else if (Field.field[players[numberOfPlayers - players_increment].position].location==30){
            System.out.println(players[numberOfPlayers - players_increment].name+ " at "+Field.field[30].title+" "+Field.field[30].action);
            players[numberOfPlayers - players_increment].position=10;
            players[numberOfPlayers - players_increment].isPrisoner=true;
            players[numberOfPlayers - players_increment].luckCount=0;
        }else if (Field.field[players[numberOfPlayers - players_increment].position].location==20){
            System.out.println(players[numberOfPlayers - players_increment].name+ " at "+Field.field[20].title+" "+Field.field[20].action);
        }else if (Field.field[players[numberOfPlayers - players_increment].position].location==10){
            System.out.println(players[numberOfPlayers - players_increment].name+ " at "+Field.field[10].title+" "+Field.field[10].action);
            players[numberOfPlayers - players_increment].luckCount=0;
        }
    }
    static boolean check_mortgage(){
        if(Field.field[Field.field[players[numberOfPlayers - players_increment].position].location].isMortgaged){
            System.out.println("property is mortgaged, no need to pay rent");
            return false;
        }else {
            System.out.println("property isn't mortgaged");
            check_owner();
            return true;
        }
    }
    static boolean check_owner(){
        if (!Field.field[Field.field[players[numberOfPlayers - players_increment].position].location].isOwned){
            System.out.println("property is free, would you like to purchase it? Otherwise an auction will be held");
            if(Field.field[Field.field[players[numberOfPlayers - players_increment].position].location].isStreet){
                Field.field_info_street(Field.field[players[numberOfPlayers - players_increment].position]);
            }else Field.field_info(Field.field[players[numberOfPlayers - players_increment].position]);
            accept_decline();
            if(yn){
                System.out.println("You have accepted to purchase this asset");
                purchase();
            }else{
                System.out.println(players[numberOfPlayers - players_increment].name+" have declined to purchase this asset, we start auction");
                auction();
            }
            return false;
        }else {
            System.out.println("property is owned by "+Field.field[Field.field[players[numberOfPlayers-players_increment].position].location].owner+" time to pay the rent");
            pay_rent();
            return true;
        }
    }
    static void purchase(){
        Field.field[players[numberOfPlayers - players_increment].position].owner=players[numberOfPlayers - players_increment].name;
        System.out.println(players[numberOfPlayers - players_increment].name+" has purchased "+Field.field[players[numberOfPlayers - players_increment].position].title);
        Field.field[players[numberOfPlayers - players_increment].position].isOwned=true;
        System.out.println(players[numberOfPlayers - players_increment].account-=Field.field[players[numberOfPlayers - players_increment].position].purchase);

    }
    static short check_t_owner(){
        String owner;
        byte a,b,c,d;
        a=b=c=d=0;
        for (byte k=0;k<numberOfPlayers; k++) {
            if (Field.field[players[numberOfPlayers - players_increment].position].owner.equals(players[k].name)) {
                owner = players[k].name;
                if (Field.field[5].isOwned && !Field.field[5].isMortgaged) {
                    if (Field.field[5].owner.equals(owner)) {
                        a = 1;
                    }
                } if (Field.field[15].isOwned && !Field.field[15].isMortgaged) {
                    if (Field.field[15].owner.equals(owner)) {
                        b = 1;
                    }
                } if (Field.field[25].isOwned && !Field.field[25].isMortgaged) {
                    if (Field.field[25].owner.equals(owner)) {
                        c = 1;
                    }
                } if (Field.field[35].isOwned && !Field.field[35].isMortgaged) {
                    if (Field.field[35].owner.equals(owner)) {
                        d = 1;
                    }
                }
            }
        break;}
        if((a+b+c+d)==1)return 25;
        else if ((a+b+c+d)==2)return 50;
        else if ((a+b+c+d)==3)return 100;
        else return 200;
    }

    static void pay_rent(){
        //System.out.println(players[numberOfPlayers - players_increment].account-=Field.field[players[numberOfPlayers - players_increment].position].defaultRent);
        for (byte i=0;i<Field.field.length;) {
            if(Field.field[i].isAsset&&Field.field[i].isOwned&&!Field.field[i].isMortgaged) {
                if(Field.field[players[numberOfPlayers - players_increment].position].label=='t'){
                    System.out.println(players[numberOfPlayers - players_increment].account-=check_t_owner());
                    for (byte k=0;k<numberOfPlayers; k++){
                        if (Field.field[players[numberOfPlayers - players_increment].position].owner.equals(players[k].name)) {
                            System.out.println(players[k].account +=check_t_owner());
                            break;}
                    }
                break;}
                if(Field.field[players[numberOfPlayers - players_increment].position].isLabelled){
                    if(Field.field[players[numberOfPlayers - players_increment].position].label=='u'&&Field.field[players[numberOfPlayers - players_increment].position].isLabelled){
                        System.out.println(players[numberOfPlayers - players_increment].account-=(10*throwDices()));
                        for (byte k=0;k<numberOfPlayers; k++){
                            if (Field.field[players[numberOfPlayers - players_increment].position].owner.equals(players[k].name)) {
                                System.out.println(players[k].account +=(10*moving));
                                break;}
                        }
                    }else{
                        System.out.println(players[numberOfPlayers - players_increment].account-=(4*throwDices()));
                        for (byte k=0;k<numberOfPlayers; k++){
                            if (Field.field[players[numberOfPlayers - players_increment].position].owner.equals(players[k].name)) {
                                System.out.println(players[k].account +=(4*moving));
                                break;}
                        }
                    }

                }else{
                for (byte k=0;k<numberOfPlayers; k++){
                if (Field.field[players[numberOfPlayers - players_increment].position].owner.equals(players[k].name)) {
                    System.out.println(players[k].account += Field.field[players[numberOfPlayers - players_increment].position].defaultRent);
                break;}
                }
                }
            }
            i++;
        }
    }

    static void take_communityChest_action(){
        if (CommunityChest.communityChest [CommunityChest.all-CommunityChest.tos].charAt(0)=='a'){
            System.out.println(players[numberOfPlayers - players_increment].name+" now at START plus $200 "+(players[numberOfPlayers - players_increment].position=0));
            System.out.println((players[numberOfPlayers - players_increment].account+=200));
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='b'){
            System.out.println(players[numberOfPlayers - players_increment].name+" plus $200 "+(players[numberOfPlayers - players_increment].account+=200));
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='c'){
            System.out.println(players[numberOfPlayers - players_increment].name+" plus $10 "+(players[numberOfPlayers - players_increment].account+=10));
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='d'){
            System.out.println(players[numberOfPlayers - players_increment].name+" minus $50 "+(players[numberOfPlayers - players_increment].account-=50));
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='e'){
            System.out.println(players[numberOfPlayers - players_increment].name+" plus $50 "+(players[numberOfPlayers - players_increment].account+=50));
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='f'){
            System.out.println(players[numberOfPlayers - players_increment].name + ", prison break card " + (players[numberOfPlayers - players_increment].commChestCard= true));
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='g'){
            System.out.println(players[numberOfPlayers - players_increment].name + " imprisoned " + (players[numberOfPlayers - players_increment].position= 10));
            System.out.println((players[numberOfPlayers - players_increment].isPrisoner=true));
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='h'){
            for (byte i=1;i<numberOfPlayers+1; i++){
                if(!players[numberOfPlayers-i].isBankrupted) {
                    players[numberOfPlayers - i].account -= 50;
                    players[numberOfPlayers - players_increment].account += 50;
                }
            }
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='i'){
            System.out.println(players[numberOfPlayers - players_increment].name+" plus $100 "+(players[numberOfPlayers - players_increment].account+=100));
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='j'){
            System.out.println(players[numberOfPlayers - players_increment].name+" plus $20 "+(players[numberOfPlayers - players_increment].account+=20));
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='k'){
            for (byte i=1;i<numberOfPlayers+1; i++){
                if(!players[numberOfPlayers-i].isBankrupted) {
                    players[numberOfPlayers - i].account -= 10;
                    players[numberOfPlayers - players_increment].account += 10;
                }
            }
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='l'){
            System.out.println(players[numberOfPlayers - players_increment].name+" plus $100 "+(players[numberOfPlayers - players_increment].account+=100));
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='m'){
            System.out.println(players[numberOfPlayers - players_increment].name+" minus $100 "+(players[numberOfPlayers - players_increment].account-=100));
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='n'){
            System.out.println(players[numberOfPlayers - players_increment].name+" minus $150 "+(players[numberOfPlayers - players_increment].account-=150));
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='o'){
            System.out.println(players[numberOfPlayers - players_increment].name+" plus $25 "+(players[numberOfPlayers - players_increment].account+=25));
        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='p'){

        }else if (CommunityChest.communityChest[CommunityChest.all-CommunityChest.tos].charAt(0)=='q'){
            System.out.println(players[numberOfPlayers - players_increment].name+" plus $100 "+(players[numberOfPlayers - players_increment].account+=100));
        }
    }
    static void take_chance_action(){
        if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='a'){
            System.out.println(players[numberOfPlayers - players_increment].name+" now at START plus $200 "+(players[numberOfPlayers - players_increment].position=0));
            System.out.println(players[numberOfPlayers - players_increment].account+=200);
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='b'){
            System.out.println(players[numberOfPlayers - players_increment].name+" now at ILLINOIS AVENUE "+(players[numberOfPlayers - players_increment].position=24));
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='c'){
            if (players[numberOfPlayers - players_increment].position>=16)System.out.println("plus $200 "+(players[numberOfPlayers - players_increment].account+=200));
            System.out.println(players[numberOfPlayers - players_increment].name + " now at ST. CHARLES PLACE " + (players[numberOfPlayers - players_increment].position = 16));
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='d'){
            if(players[numberOfPlayers - players_increment].position>=28&&players[numberOfPlayers - players_increment].position<12){
                System.out.println(players[numberOfPlayers - players_increment].name + " now at ELECTRIC UTILITY " + (players[numberOfPlayers - players_increment].position = 12));
                //purchase()
            }else if (players[numberOfPlayers - players_increment].position<28&&players[numberOfPlayers - players_increment].position>=12){
                System.out.println(players[numberOfPlayers - players_increment].name + " now at WATER UTILITY " + (players[numberOfPlayers - players_increment].position = 28));
                //purchase();
            }
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='e'){
            if(players[numberOfPlayers - players_increment].position>=35&&players[numberOfPlayers - players_increment].position<5){
                System.out.println(players[numberOfPlayers - players_increment].name + " now at SUBWAY " + (players[numberOfPlayers - players_increment].position = 5));
                //purchase();
            }else if(players[numberOfPlayers - players_increment].position>=5&&players[numberOfPlayers - players_increment].position<15){
                System.out.println(players[numberOfPlayers - players_increment].name + " now at RAILWAY " + (players[numberOfPlayers - players_increment].position = 15));
                //purchase();
            }else if(players[numberOfPlayers - players_increment].position>=15&&players[numberOfPlayers - players_increment].position<25) {
                System.out.println(players[numberOfPlayers - players_increment].name + " now at PORT " + (players[numberOfPlayers - players_increment].position = 25));
                //purchase();
            }else if(players[numberOfPlayers - players_increment].position>=25&&players[numberOfPlayers - players_increment].position<35) {
                System.out.println(players[numberOfPlayers - players_increment].name + " now at AIRPORT " + (players[numberOfPlayers - players_increment].position = 35));
                //purchase();
            }
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='f'){
            System.out.println(players[numberOfPlayers - players_increment].name + ", plus $50 " + (players[numberOfPlayers - players_increment].account+= 50));
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='g'){
            System.out.println(players[numberOfPlayers - players_increment].name + ", prison break card " + (players[numberOfPlayers - players_increment].chanceCard= true));
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='h'){
            System.out.println(players[numberOfPlayers - players_increment].name + " moving back 3 times  " + (players[numberOfPlayers - players_increment].position-= 3));
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='i'){
            System.out.println(players[numberOfPlayers - players_increment].name + " imprisoned " + (players[numberOfPlayers - players_increment].position= 10));
            System.out.println((players[numberOfPlayers - players_increment].isPrisoner=true));
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='j'){

        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='k'){
            System.out.println(players[numberOfPlayers - players_increment].name + ", minus $15 " + (players[numberOfPlayers - players_increment].account-= 15));
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='l'){
            if(players[numberOfPlayers - players_increment].position>=5){System.out.println("plus $200 "+(players[numberOfPlayers - players_increment].account+=200));}
            System.out.println(players[numberOfPlayers - players_increment].name + " now at SUBWAY " + (players[numberOfPlayers - players_increment].position = 5));
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='m'){
            System.out.println(players[numberOfPlayers - players_increment].name + " now at BOARDWALK " + (players[numberOfPlayers - players_increment].position = 39));
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='n'){
            for (byte i=1;i<numberOfPlayers+1; i++){
                if(!players[numberOfPlayers-i].isBankrupted) {
                    players[numberOfPlayers - i].account += 50;
                    players[numberOfPlayers - players_increment].account -= 50;
                }
            }
            System.out.println(players[numberOfPlayers - players_increment].account);
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='o'){
            System.out.println(players[numberOfPlayers - players_increment].name + ", plus $150 " + (players[numberOfPlayers - players_increment].account+= 150));
        }else if (Chance.chance[Chance.all-Chance.tos].charAt(0)=='p'){
            System.out.println(players[numberOfPlayers - players_increment].name + ", plus $100 " + (players[numberOfPlayers - players_increment].account+= 100));
        }
    }
//    static pay_rent(){}
//    static purchase_asset(){}
    static void auction(){
        System.out.println("Type in an amount you are ready to offer. The highest bid wins as always.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));{
            try {
                short highest_bid=0;
                byte in_auction_count=0;
                while(!(players.length-in_auction_count==1)) {
                    for (byte i = 0; i < i + 1; ) {
                        if (players[i].inAuction) {
                            System.out.println(players[i].name + " your offer");
                            short higher_bid = (short) Integer.parseInt(br.readLine());
                            players[i].auction = higher_bid;
                            if (players[i].auction > highest_bid) {
                                highest_bid = players[i].auction;
                                System.out.println(players[i].name + " OFFERED MORE $" + players[i].auction);
                            } else {
                                players[i].inAuction = false;
                                in_auction_count++;
                            }
                            if(players.length-in_auction_count==1){
                                for (Players player : players) {
                                    if (player.inAuction) {
                                        System.out.println(player.name + " WINS AUCTION, paid $" + player.auction + " " + (player.account -= highest_bid));
                                        Field.field[players[numberOfPlayers - players_increment].position].owner = player.name;
                                        System.out.println(player.name + " now has asset " + Field.field[players[numberOfPlayers - players_increment].position].title);
                                        Field.field[players[numberOfPlayers - players_increment].position].isOwned = true;
                                        break;
                                    }
                                }
                                break;
                            }
                        }
                        i++;
                        if (i == players.length) i = 0;
                    }
                }
                System.out.println("cleaning");
                for (Players player : players) {
                    player.auction = 0;
                    player.inAuction = true;
                }
            }catch (IOException e) {
                System.out.println("please type in correctly, an auction starts over");
                for (Players player : players) {
                    player.auction = 0;
                    player.inAuction = true;
                }
                auction();
            }catch (NumberFormatException e){
                System.out.println("please type in correctly, an auction starts over");
                for (Players player : players) {
                    player.auction = 0;
                    player.inAuction = true;
                }
                auction();
            }
        }
    }

    // Implementing Fisher–Yates shuffle
    static void shuffleArray(String[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }




    static void small(){
        System.out.println("\"how\" to get this info, \"yes\" to agree, \"no\" to refuse, \"full\" to request full (buildings only info)");
    }
    static void big(){
        System.out.println("\"how\" to get this info, \"accept\" to agree, \"decline\" to refuse\n\"mortgage\" to obtain mortgage loan, \"buy house\" to buy house, \"buy hotel\" to buy hotel\n\"sell house\" to sell house, \"sell hotel\" to sell hotel\n\"sell out\" to sell everything in group, \"sell off\" to sell all buildings\n\"trade\" try to get the biggest bid for your assets, \"exchange\" try to make wise deal");
    }
    static boolean yn;
    static void accept_decline(){
        System.out.println(players[numberOfPlayers - players_increment].name + " do you agree or not, \"how\" to make better choice");
        BufferedReader agree_refuse = new BufferedReader(new InputStreamReader(System.in));
        try {
            String insrt = agree_refuse.readLine();
            switch (insrt){
                case "how":small();accept_decline();break;
                case "full":Field.full_field_info(Field.field[players[numberOfPlayers - players_increment].position]);accept_decline();break;
                case "yes": yn=true;break;
                case "no":yn=false;break;
                default:System.out.println(" type in correctly");accept_decline();break;
            }
        } catch (IOException e) {
            System.out.println("please type in correctly");
            accept_decline();
        }
    }

    static byte players_increment,turn,bankruptedCount;
    static boolean notBoss;
    static void move(){

        while(numberOfPlayers-players_increment<numberOfPlayers-turn){

        if (players_increment < 1) {
            players_increment = numberOfPlayers;
            turn= (byte)(players_increment-1);
        }

        if (players[numberOfPlayers - players_increment].isBankrupted) {
            players_increment--;
            turn--;
            continue;
        }
        if (numberOfPlayers - bankruptedCount == 1){
            System.out.println("\nGAME OVER \n" + players[numberOfPlayers - players_increment].name + " is WINNER");
            break;
        }
        if (players[numberOfPlayers - players_increment].isPrisoner) {
            in_prison();
        }
        if(players[numberOfPlayers - players_increment].isPrisoner){
            players_increment--;
            turn--;
            continue;}
        System.out.println(players[numberOfPlayers - players_increment].name + " type in \"throw\" to move");
        BufferedReader type = new BufferedReader(new InputStreamReader(System.in));
        try {
            String typeIn = type.readLine();
            switch (typeIn) {
                case "throw": {
                    throwDices();
                    //cell action requied
                    if (dOne != dTwo) {
                        if (players[numberOfPlayers - players_increment].position + moving >= 40) {
                            players[numberOfPlayers - players_increment].position += moving - 40;
                            players[numberOfPlayers - players_increment].account += 200;
                            System.out.println(players[numberOfPlayers - players_increment].name + " has chased loop and got reward +$200 " + players[numberOfPlayers - players_increment].account);
                        } else {
                            players[numberOfPlayers - players_increment].position += moving;
                        }
                        System.out.println(dOne + " != " + dTwo + " moving to " + moving + " cells");
                        System.out.println(players[numberOfPlayers - players_increment].name + " position " + players[numberOfPlayers - players_increment].position);
                        if (players[numberOfPlayers - players_increment].luckCount > 0)
                            players[numberOfPlayers - players_increment].luckCount = 0;
                        check_Asset();
                        players_increment--;
                        turn--;
                        continue;
                    }
                    if (dOne == dTwo) {
                        if (players[numberOfPlayers - players_increment].luckCount == 2) {
                            System.out.println("excessive luck " + dOne + "==" + dTwo + " " + players[numberOfPlayers - players_increment].name + " go to prison");
                            players[numberOfPlayers - players_increment].position = 10;
                            System.out.println((players[numberOfPlayers - players_increment].isPrisoner=true));
                            players[numberOfPlayers - players_increment].luckCount = 0;
                            players_increment--;
                            turn--;
                            continue;
                        }
                        if (players[numberOfPlayers - players_increment].position + moving >= 40) {
                            players[numberOfPlayers - players_increment].position += moving - 40;
                            players[numberOfPlayers - players_increment].account += 200;
                            System.out.println(players[numberOfPlayers - players_increment].name + " has chased loop and got reward +$200 " + players[numberOfPlayers - players_increment].account);
                        } else {
                            players[numberOfPlayers - players_increment].position += moving;
                        }
                        System.out.println(dOne + "==" + dTwo + " moving to " + moving + " cells");
                        System.out.println(players[numberOfPlayers - players_increment].name + " position " + players[numberOfPlayers - players_increment].position);
                        players[numberOfPlayers - players_increment].luckCount++;
                        System.out.println("Beware to much lucky " + players[numberOfPlayers - players_increment].luckCount);
                        check_Asset();
                    }
                }
                break;
                case "asset":
                    asset();
                    break;
                case "help":
                    help();
                    break;
                case "save":
                case "load":
                    System.out.println("this feature in development");
                    //move();
                    break;
                case "done": {
                    players_increment--;/*move()*/
                    turn--;
                    break;
                }
                case "retire":
                    players[numberOfPlayers - players_increment].isBankrupted = true;
                    bankruptedCount++;
                    players_increment--;
                    turn--;
                    break;
                case "status":
                    players_status(players[numberOfPlayers - players_increment]);
                    break;//move();
                case "info":
                    field_hosted_info();
                    break;
                case "quit":
                    System.out.println("GAME OVER");
                    break;
                case "cheat_LIKE_A_BOSS":
                    if (notBoss&& !players[numberOfPlayers - players_increment].isBankrupted){
                        System.out.println("THE BOSS IS ONE, you out");
                        players[numberOfPlayers - players_increment].isBankrupted=true;
                        players_increment--;
                        turn--;
                        break;
                    }
                    players[numberOfPlayers - players_increment].account += 1000;
                    notBoss=true;
                    break;
                default:
                    System.out.println("please type in correctly");
                    break;
            }
        } catch (IOException e) {
            System.out.println("please type in correctly");
            //move();
        }
    }
    }

    static void in_prison(){
        System.out.println(players[numberOfPlayers - players_increment].name + " you are in prison, try to get out from here\ntype in \"dices\" to get pair\nor you can use card \"card\"\nalso you can pay $50 to set free \"pay\"");
        BufferedReader tpe = new BufferedReader(new InputStreamReader(System.in));
        try {
            String tpn = tpe.readLine();
            switch (tpn) {
                case "dices":throwDices();{
                    if (dOne != dTwo){
                        System.out.println(dOne+" != "+dTwo+" stay in prison");
                        players[numberOfPlayers - players_increment].isPrisoner=true;
                        players[numberOfPlayers - players_increment].prisonBreakCount++;
                        if(players[numberOfPlayers - players_increment].prisonBreakCount==3){
                            System.out.println(players[numberOfPlayers - players_increment].name+" you have paid $50 and move on");
                            players[numberOfPlayers - players_increment].account-=50;
                            players[numberOfPlayers - players_increment].prisonBreakCount=0;
                            players[numberOfPlayers - players_increment].isPrisoner=false;
                        }
                        break;
                    }if(dOne == dTwo){
                        System.out.println(dOne+" == "+dTwo+" you have been set free");
                        players[numberOfPlayers - players_increment].isPrisoner=false;
                        players[numberOfPlayers - players_increment].prisonBreakCount=0;
                        break;
                    }
                }
                case "card":
                    if(players[numberOfPlayers - players_increment].chanceCard) {
                        System.out.println("you have used your chance card to set free");
                        players[numberOfPlayers - players_increment].chanceCard = false;
                        players[numberOfPlayers - players_increment].prisonBreakCount = 0;
                        players[numberOfPlayers - players_increment].isPrisoner = false;
                        break;
                    }else if(players[numberOfPlayers - players_increment].commChestCard){
                        System.out.println("you have used your Community Chest card to set free");
                        players[numberOfPlayers - players_increment].chanceCard = false;
                        players[numberOfPlayers - players_increment].prisonBreakCount = 0;
                        players[numberOfPlayers - players_increment].isPrisoner = false;
                        break;
                    }else{
                        System.out.println("you don't have cards to free");
                        in_prison();
                    }break;
                case "pay": {
                    System.out.println("you chose to pay $50");
                    players[numberOfPlayers - players_increment].account-=50;
                    players[numberOfPlayers - players_increment].prisonBreakCount = 0;
                    players[numberOfPlayers - players_increment].isPrisoner = false;
                }break;
                default:System.out.println(" type in correctly");in_prison();break;
            }
        }catch (IOException e) {
            System.out.println("type in correctly");
            in_prison();
        }
    }



    static String [] fillNames (){
        String [] def_name = {"Player_1","Player_2","Player_3","Player_4","Player_5","Player_6"};
        switch (def_names.length){
            case 2:
                def_names = Arrays.copyOfRange(def_name,0,2);
                System.out.println("array "+Arrays.toString(def_names));
                break;
            case 3:
                def_names = Arrays.copyOfRange(def_name,0,3);
                System.out.println("array "+Arrays.toString(def_names));
                break;
            case 4:
                def_names = Arrays.copyOfRange(def_name,0,4);
                System.out.println("array "+Arrays.toString(def_names));
                break;
            case 5:
                def_names = Arrays.copyOfRange(def_name,0,5);
                System.out.println("array "+Arrays.toString(def_names));
                break;
            case 6:
                def_names = Arrays.copyOfRange(def_name,0,6);
                System.out.println("name array "+Arrays.toString(def_names));
                break;
        }
        return def_names;
    }




    static byte insertPlayers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("insert the number of players, from 2 to 6 \nif you want to quit the game press 0");
        try{
            numberOfPlayers = sc.nextByte();
            if (numberOfPlayers == 0){
                System.out.println("GAME OVER");
                go_go=false;
            }else if (numberOfPlayers<2 || numberOfPlayers>6){
                System.out.println("PLEASE from 2 to 6 ONLY");
                return insertPlayers();
            }
        }catch (InputMismatchException e){
            System.out.println("no pranks");
            return insertPlayers();
        }
        def_names = new String[numberOfPlayers];
        if (numberOfPlayers!=0) yes_no();
        return numberOfPlayers;
    }
    static byte yes_no(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Would you like to enter player's names?\nYES press 1 \nNO  press 0 (default names will be given)\npress 2 if you want to change the amount of players");
        try{
            yes_no = scn.nextByte();
            if (yes_no==0){
                System.out.println("default names will be given");
                def_names=fillNames();
            }else if (yes_no==1){
                System.out.println("enter player's name after name\ntype in \"again\" to start over");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                for (byte i =0; i<def_names.length; i++){
                    try {
                        def_names[i]=br.readLine();
                    } catch (IOException e) {
                        System.out.println("please type in correctly");
                        yes_no();
                    }
                    if (def_names[i].equals("again")||def_names[i].isBlank())
                        yes_no();
                }
            }else if (yes_no==2){
                System.out.println("choose wisely");
                return insertPlayers();
            }else {
                System.out.println("1 OR 0");
                return yes_no();
            }
        }catch (InputMismatchException e){
            System.out.println("no pranks");
            return yes_no();
        }
        return yes_no;
    }

}
