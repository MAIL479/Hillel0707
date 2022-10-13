package Homeworks.homeworks23.Main;

import Homeworks.homeworks23.Subcategories.individual_entrepreneur.IndividualEntrepreneur;
import Homeworks.homeworks23.Subcategories.legal_face_entrepreneur.LegalFaceEntrepreneur;
import Homeworks.homeworks23.Subcategories.physical_face_entrepreneur.PhysicalFaceEntrepreneur;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        IndividualEntrepreneur ie = new IndividualEntrepreneur(1000);
        ie.getSumm();

        ie.deposit(100);
        ie.getSumm();
        ie.getMoney(100);
        ie.getSumm();


        LegalFaceEntrepreneur lfe = new LegalFaceEntrepreneur(500);
        lfe.getSumm();

        lfe.deposit(100);
        lfe.getSumm();
        lfe.getMoney(100);
        lfe.getSumm();

        PhysicalFaceEntrepreneur pfe = new PhysicalFaceEntrepreneur(500);
        pfe.getSumm();

        pfe.deposit(100);
        pfe.getSumm();
        pfe.getMoney(100);
        pfe.getSumm();
    }
}