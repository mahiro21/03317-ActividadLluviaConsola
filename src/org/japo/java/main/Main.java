/* 
 * Copyright 2019 Mario Merlos Abella <mario.merlos.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {

        //variables & Constantes
        final int MAX = 500;
        final int MIN = 0;

        int dia;
        int lluvia;
        int tLluvia = 0;

        //Inicio bucle
        dia = 1;

        do {
            int valor = RND.nextInt(MAX - MIN + 1) + MIN;
            tLluvia += valor;
            lluvia = valor;
            System.out.printf("Lluvia durante el día %d ....: %d Litros por metro cuadrado%n", dia, lluvia);
            dia++;

        } while (dia <= 7);
        System.out.printf("Lluvia total durante la semana ....: %d%n", tLluvia);
        System.out.println("END");

    }

}
