package java.logic.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Controller {
    public static void main(String[] args) throws Exception {
        Controller controller = new Controller();
        List<String> inputList = controller.csvReader();
        controller.csvWriter(inputList);
        controller.add(5, 4);
    }

    public List<String> csvReader() throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader("C:/Users/Rei23/git/github_actions_otameshi/HelloWorld/data.csv"))) {
            String line;
            int count = 0;
            List<String> list = new ArrayList<String>();
            while ((line = br.readLine()) != null) { // 読み込み
                String[] columns = line.split(",", -1); // 行をカンマ区切りで配列に変換
                for (String column : columns) {
                    if (count == 0) { // header除去
                        count++;
                        continue;
                    }
                    list.add(column);
                }
            }
            return list;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void csvWriter(List<String> inputList) throws IOException {
        File outputFile = new File("C:/Users/Rei23/git/github_actions_otameshi/HelloWorld/output.csv");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            if (outputFile.exists()) {
                outputFile.delete();
                System.out.println("既にある出力ファイルを削除したワンね～～");
            }
            bw.write("わんが天気予報をするワンね～～");
            bw.newLine();
            for (String list : inputList) {
                bw.write(list);
                bw.write(",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int add(int x, int y) {
        return x + y;
    }
}
