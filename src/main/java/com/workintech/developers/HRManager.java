package com.workintech.developers;

public class HRManager extends Employee{
    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager starts working");
        setSalary(100000);
    }

   private String[] juniorDeveloper;
    private String[] midDeveloper;
    private  String[] seniorDeveloper;

//HRManager sınıfında 3 adet instance variable tanımlanmalı. JuniorDeveloper, MidDeveloper, SeniorDeveloper lar için birer array.
//HRManager addEmployee isimli bir metoda sahip olmalı. Bu metod için gerekli Overload edilmiş hallerini tanımlamalısınız.
//Bu metodun amacı JuniorDeveloper gelirse ilgili developeri juniorDevelopers dizisine eklemeli.
//MidDeveloper gelirse ilgili developeri midDevelopers dizisine eklemeli.
//SeniorDeveloper gelirse ilgili developeri seniorDevelopers dizisine eklemeli.
//Bu eklemeler yapılırken ilgili dizide index alanı dolu mu diye bakılmalı. Doluysa içerdeki veri ezilmemeli. Bir uyarı verilmeli. Aynı zamanda indexin hiç var olmadığı durum da göz önünde bulundurulmalı.
}
