package com.clear;

public class Clear {
    public static void ClearConsole() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {

            System.out.println("No se pudo limpiar la pantalla, error: " + e);
        }
    }
}
