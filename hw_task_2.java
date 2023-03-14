package Java_sem_2.java_hw_2;
// Дана строка (получение через обычный текстовый файл!!!)
//
//"фамилия":"Иванов","оценка":"5","предмет":"Математика"
//"фамилия":"Петрова","оценка":"4","предмет":"Информатика"
//
//Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
//Студент [фамилия] получил [оценка] по предмету [предмет].
//
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.


import java.io.BufferedReader;
import java.io.FileReader;


public class hw_task_2 {
    public static String [] ReadFromFile(String pathway) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(pathway));
        String str;
        int size = 0;
        while ((str = br.readLine()) != null) {
            size +=1;
        }
        br.close();
        String [] listData = new String [size];

        int i = 0;
        BufferedReader br1 = new BufferedReader(new FileReader(pathway));
        while ((str = br1.readLine()) != null) {
            listData[i] = str;
            i += 1;
        }
        br1.close();
        return listData;

    }

    public static void main(String[] args) {
        String [] arrayData = new String[0];
        try {
            arrayData = ReadFromFile("students.txt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < arrayData.length; i++) {
            System.out.println(PrintLine(arrayData[i]));
        }
    }
    public static StringBuilder PrintLine(String line) {
        String line1 = line.replace("\"", "");
        StringBuilder result = new StringBuilder("");
        String [] arrayData = line1.split(",");
        String [] listName = {"Студент ", " получил ", " по предмету "};
        for (int i =0; i < arrayData.length; i++) {
            String[] arrData = arrayData[i].split(":");
            result.append(listName[i]);
            result.append(arrData[1]);
        }
        return result;
    }
}
