package com.example.myapplication32

import java.util.Scanner

fun main(){
    maasHesabla()
}
fun maasHesabla(){
    val scanner = Scanner(System.`in`);
    var sum = 0
    val salaryHours = 5
    for(i in 1..7){
        println("$i - ci gun  nece saat islediyinizi yazin: ");
        val workerHours = scanner.nextInt();
        println("saatlar: $workerHours")
        sum +=workerHours
        val result = sum*salaryHours;
        println("heftelik isleme saat: $sum \n heftelik maas: $result")
    }
    if(sum>40){
        var salaryOvertime = salaryHours * 1.5 * sum;
        println("40 saatdan cox islediyiniz ucun toplam maas: $salaryOvertime")
    }
// }
