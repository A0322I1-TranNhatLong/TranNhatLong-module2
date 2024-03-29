package Exam_md2.controllers;

import Exam_md2.services.MedicalRecordsService;
import Exam_md2.services.MedicalRecordsServiceImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MedicalRecordsController {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void displayMainMenu(){
        while (true){
            try {
                MedicalRecordsService medicalRecordsService = new MedicalRecordsServiceImpl();
                System.out.println("*****CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN*****");
                System.out.println("Chọn chức năng theo số (để tiếp tục): ");
                System.out.println("1. Thêm mới");
                System.out.println("2. Xóa");
                System.out.println("3. Xem danh sách các bệnh án");
                System.out.println("4. Thoát");
                System.out.print("***Vui lòng chọn chức năng từ 1 đến 4 : ");
                int choice = Integer.parseInt(SCANNER.nextLine());
                switch (choice){
                    case 1:
                        try {
                            medicalRecordsService.add();
                        }catch (Exception e){
                            e.printStackTrace();
                            System.out.println("Tạo mới thông tin thành công !");

                        }
                        break;
                    case 2:
                        medicalRecordsService.delete();
                        break;
                    case 3:
                        medicalRecordsService.displayAll();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Vui lòng chọn chức năng từ 1 đến 4 : ");
                }
            }catch (NumberFormatException e){
                System.out.println("Bạn phải chọn số từ 1 đến 4.");
            }catch (FileNotFoundException e){
                System.out.println("Lỗi không tìm thấy file !");
            }catch (IOException e){
                System.out.println("Lỗi nhập / xuất file ! ");
            }catch (Exception e){
                System.out.println("Lỗi khác (LocalDate.parse()");
            }
        }
    }
}
