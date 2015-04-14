package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader bReader;
        try {
            bReader = new BufferedReader(new FileReader("exampleData.txt"));
            String lineConstant;
            Boolean matchMode;
            String matchBuffor;
            KwotaDataStateMachine kdst = new KwotaDataStateMachine();
            while ((lineConstant = bReader.readLine()) != null) {
                matchMode = false;
                kdst.resetMachine();
                matchBuffor = "";
                for (Integer i = 0; i < lineConstant.length(); i++) {
                    Character c = lineConstant.charAt(i);
                    kdst.retriveState(c);
                    if (kdst.isCompleted) {
                        matchMode = false;
                        System.out.print(kdst.token);
                        kdst.resetMachine();
                        matchBuffor = "";
                    } else if (kdst.isAccordance) {
                        matchBuffor += c;
                        if (!matchMode) {
                            matchMode = true;
                        }
                    } else if (matchMode) {
                        matchBuffor += c;
                        System.out.print(matchBuffor);
                        matchBuffor = "";
                        matchMode = false;
                    } else {
                        System.out.print(c);
                    }
                    if (i.equals(lineConstant.length() - 1)) {
                        if (matchMode && !kdst.isCompleted) {
                            System.out.print(matchBuffor);
                        }
                        System.out.print("\n");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}