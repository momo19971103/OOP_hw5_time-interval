package com.example.lib;

import java.util.Scanner;

public class ChangeSec {

    private Scanner scanner = new Scanner(System.in);
    private int total,hr,min,sec = 0;

    public int getTotal(int i){
        System.out.printf("�п�J�� %d �ɶ��p�ɼ�\n",i);
        hr = scanner.nextInt();
        System.out.printf("�п�J�� %d �ɶ�������\n",i);
        min = scanner.nextInt();
        System.out.printf("�п�J�� %d �ɶ����\n",i);
        sec = scanner.nextInt();
        total=hr*3600+min*60+sec;
        return total;
    }


}
