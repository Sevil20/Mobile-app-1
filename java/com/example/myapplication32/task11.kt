package com.example.myapplication32

import java.util.Scanner

fun main(){
    //task-1

//    while(true){
//        var userFirstValue = Scanner(System.`in`);
//        println("enter the first number");
//        var userValue1 = userFirstValue.nextInt();
//
//        var userSecondValue = Scanner(System.`in`);
//        println("enter the second number");
//        var userValue2 = userSecondValue.nextInt();
//        var selectionValue = Scanner(System.`in`);
//        println("\n 1.Toplama \n 2.Cixma \n 3.Vurma \n 4.Bolme \n 5.Qaliq gosterme \n");
//        var select = selectionValue.nextInt();
//
//        if(userValue1==-1 || userValue2==-1 || select==-1){
//            break
//        }
//        if(select==1){
//            var plus = userValue1 + userValue2;
//            println(plus.toString())
//        }
//        else if(select==2){
//            var minus = userValue1 - userValue2;
//            println(minus.toString())
//        }
//        else if(select==4) {
//            var division = userValue1 / userValue2;
//            println(division.toString())
//        }
//        else if(select==3) {
//            var multiple = userValue1 * userValue2;
//            println(multiple.toString())
//        }
//        else if(select==5){
//            var residue = userValue1 % userValue2;
//            println(residue.toString())
//        }
//        else{
//            println("select the correct option");
//        }
//    }



    //task-2

//    var scanner = Scanner(System.`in`);
//    println("Enter the your name");
//    var userName = scanner.nextLine();
//
//    println("enter the number");
//    var userEnterNumber = scanner.nextInt();
//    for(i in 1..userEnterNumber){
//            println(userName);
//    }


    //task-3
//    var value = Scanner(System.`in`);
//    var userValue = value.nextInt();
//    var user = userValue%2
//  when(user){
//     0 ->{
//          println("cut ededdir");
//      }
//      1 ->{
//       println("tek ededdir");
//      }
//      else ->{
//          println("Sehv!")
//      }
//  }


    //task-4

//        val user = Scanner(System.`in`)
//        println("Adınızı daxil edin")
//        val userName = user.nextLine()
//
//        val cardInput = Scanner(System.`in`)
//        println("Kartinizin meblegini daxil edin")
//        var cardNumber = cardInput.nextDouble()
//
//        while (true) {
//            println("\nSeçim edin:\n1. Mebleği göstər\n2. Mebleg daxil et \n3.Pul cixart \n-1. Proqramı bitir")
//            val selectInput = Scanner(System.`in`)
//            val userSelection = selectInput.nextInt()
//
//            when (userSelection) {
//                1 -> println("Kartinizdaki mebleg: $cardNumber")
//                2 -> {
//                    println("Daxil etmək istədiyiniz mebleği daxil edin:")
////                    val card2Input = Scanner(System.`in`)
////                    var cardValue = card2Input.nextDouble()
//                    cardNumber += cardNumber
//                    println("\nYeni mebleğ: $cardNumber və ümumi mebleğ: ${cardNumber + userSelection}")
//                }
//                3 ->{
//                    println("Cixarmaq istediyiniz meblegi daxil edin:")
////                    var card3Input = Scanner(System.`in`);
////                    var cardValueTwo = card3Input.nextDouble();
//                    if (cardNumber  > userSelection) {
//                        println("Proses bitdi. Kartınızda kifayət qədər məbləğ yoxdur.");
//                        break;
//                    }
//                }
//                -1 -> {
//                    println("Proqram bitdi")
//                    break
//                }
//                else -> println("Yalnış əməliyyat. Yenidən seçim edin.")
//            }
//        }


    //task-5
//
//    val scanner = Scanner(System.`in`)
//
//    println("Vize qiymətini daxil edin:")
//    val vizeQiymeti = scanner.nextDouble()
//
//    println("Final qiymətini daxil edin:")
//    val finalQiymeti = scanner.nextDouble()
//
//    val fennOrtalamasi = (vizeQiymeti * 0.4) + (finalQiymeti * 0.6)
//    var qiymet = ""
//
//    when {
//        fennOrtalamasi >= 71 -> qiymet= "əla"
//        fennOrtalamasi >= 61 -> qiymet = "yaxşı"
//        fennOrtalamasi >= 51 -> qiymet = "orta"
//        else -> qiymet = "kəsr"
//    }
//
//    println("Fənn ortalaması: $fennOrtalamasi")
//    println("Qiymət: $qiymet")

}