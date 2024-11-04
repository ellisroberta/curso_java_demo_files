/* package application;

import java.io.File;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caminho da pasta: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);

        // Verifica se o caminho é um diretório e se existe
        if (path.exists() && path.isDirectory()) {
            File[] folders = path.listFiles(File::isDirectory);
            System.out.println("PASTAS:");
            if (folders != null) {
                for (File folder : folders) {
                    System.out.println(folder);
                }
            } else {
                System.out.println("Nenhuma pasta encontrada.");
            }

            File[] files = path.listFiles(File::isFile);
            System.out.println("ARQUIVOS:");
            if (files != null) {
                for (File file : files) {
                    System.out.println(file);
                }
            } else {
                System.out.println("Nenhum arquivo encontrado.");
            }

            boolean success = new File(strPath + "\\subdir").mkdir();
            System.out.println("Diretório criado com sucesso: " + success);
        } else {
            System.out.println("O caminho fornecido não é um diretório válido.");
        }

        sc.close();
    }
}*/

package application;

import java.io.File;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);
        sc.close();
    }
}