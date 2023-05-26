/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.strukdatm5lat1;

/**
 *
 * @author USER
 */
public class StrukDatM5Lat1 {

    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();
        
        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);
        
        System.out.printf("\n");
        System.out.printf("Struktur Data Modul 5 Latihan 1");
        System.out.printf("\nMerubah Urutan Data Menjadi Binary Tree");
        System.out.printf("\n");
        
        System.out.printf("\nPre Order : ");
        pohon.preOrder(pohon.root);
        System.out.printf("\nIn Order : ");
        pohon.inOrder(pohon.root);
        System.out.printf("\nPost Order : ");
        pohon.postOrder(pohon.root);
    }
}
