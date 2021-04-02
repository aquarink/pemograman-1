package Bag_18_Auth;

import java.util.*;
import java.sql.*;

public class List_Data {

    static boolean runn = true;
    static String flag;
    static String add;
    static String[] kontak = new String[20];

    // MYSQL DATABASE
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/gelaro_db";
    static final String USER = "root";
    static final String PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public static void main(String[] ini_argumen) {
        Scanner inputan = new Scanner(System.in);

        try {
            while (runn) {
                System.out.println("=============================================");
                System.out.println("================ MANAGE DATA ================");
                System.out.println("PILIH ACTION");
                System.out.println("1. Lihat Data");
                System.out.println("2. Tambah Data");
                System.out.println("=============================================");
                System.out.print("Masukan Pilihan : ");

                flag = inputan.nextLine();

                System.out.println("");
                System.out.println("");

                switch (flag) {
                case "exit":
                    runn = false;
                    break;
                case "1":
                    Class.forName(JDBC_DRIVER);
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    stmt = conn.createStatement();
                    String sql = "SELECT * FROM users_tb";
                    rs = stmt.executeQuery(sql);

                    while (rs.next()) {
                        System.out.println("NAMA \t: " + rs.getString("full_name"));
                        System.out.println("EMAIL \t: " + rs.getString("email_address"));
                        System.out.println("---------------------------------------------");
                    }

                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

                    stmt.close();
                    conn.close();
                    break;
                case "2":
                    for (int i = 0; i < 2; i++) {

                        if (i == 0) {
                            System.out.print("Masukan Nama \t\t: ");

                        } else {
                            System.out.print("Masukan Email \t\t: ");
                        }

                        add = inputan.nextLine();

                        kontak[i] = add;

                    }

                    Class.forName(JDBC_DRIVER);
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    stmt = conn.createStatement();

                    String add = " insert into users_tb (full_name, email_address) values (?, ?)";
                    PreparedStatement preparedStmt = conn.prepareStatement(add);

                    for (int i = 0; i < kontak.length; i++) {
                        if (kontak[i] != null) {
                            // System.out.println("ISI ARRAY " + (i + 1) + " = " + kontak[i]);

                            if (i == 0) {
                                preparedStmt.setString(1, kontak[0]);
                            } else if (i == 1) {
                                preparedStmt.setString(2, kontak[1]);
                            }

                            System.out.println("Menambahkan data berhasil");
                        }
                    }

                    preparedStmt.execute();

                    String sql_list = "SELECT * FROM users_tb";
                    rs = stmt.executeQuery(sql_list);

                    while (rs.next()) {
                        System.out.println("NAMA \t: " + rs.getString("full_name"));
                        System.out.println("EMAIL \t: " + rs.getString("email_address"));
                        System.out.println("---------------------------------------------");
                    }

                    stmt.close();
                    conn.close();

                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
                }

                if (flag == "done") {
                    inputan.close();
                }
            }
        } catch (Exception e) {
            System.out.print("Error Pada =================== " + e);
        }

    }
}
