package ss16_IO_text_file.bai_tap;

import java.io.*;
import java.util.ArrayList;

public class CopyFile {
    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        copyFile.copyFile("D:\\CodeGym\\module_2\\src\\ss16_IO_text_file\\thuc_hanh\\text.txt",
                "D:\\CodeGym\\module_2\\src\\ss16_IO_text_file\\bai_tap\\copytext.txt");
    }
    private ArrayList<String> readFileText(String filePath) {
        ArrayList<String> arrayList=new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                arrayList.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println(" File không tồn tại or nội dung có lỗi !");
        }
        return arrayList;
    }
    private void writeFile(String filePath, ArrayList<String> arrayList){
        try {
            int dem=0;
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (String string:arrayList)
            {
                bufferedWriter.write(string);
                dem+=string.length();
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            System.out.println("Số ký tự trong tệp là: "+dem);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void copyFile(String filePath1,String filePath2)
    {
        writeFile(filePath2,readFileText(filePath1));
    }
}
