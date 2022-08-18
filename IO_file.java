package MiniStrore_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class IO_file {
	
	
	private static final String String = null;

	public void readfile()
	{
		ArrayList<SANPHAM> dssp = new ArrayList<SANPHAM>();
		try 
		{
			File f = new File("sanpham.txt");
			FileReader fr = new FileReader(f);
			 BufferedReader br = new BufferedReader(fr);
			  String line = br.readLine();
	            while(line != null) 
	            {
	            	  String arr[] = line.split("[;]+");
	            	  SANPHAM sp = new SANPHAM(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),arr[4]);
	            	  sp.output();
	            	  dssp.add(sp);
	            	  line = br.readLine();
	            }
	            br.close();
	            fr.close();
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void writefile(List<SANPHAM> list)
	{
		
		try 
		{
			File f = new File("sanpham.txt");
			FileWriter fw = new FileWriter(f);
			 PrintWriter pw = new PrintWriter(fw);
			 for(SANPHAM sp : list) 
			 {
				 String line = sp.getMaSP()+";"+sp.getTenSP()+";"+sp.getGia()+";"+sp.getSl()+";"+sp.getDvt();
				 pw.println(line);
			 }
				 pw.close();
	            fw.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	////lỗi
	
	/*
	public void write(SANPHAM sp)
	{
		BufferedWriter bw = null;
		FileWriter fw = null;
		ArrayList<SANPHAM> dssp = new ArrayList<SANPHAM>();
		try 
		{
			String line = sp.getMaSP()+";"+sp.getTenSP()+";"+sp.getGia()+";"+sp.getSl()+";"+sp.getDvt();
			File file = new File(FILENAME);
			if (!file.exists()) 
			{	
				file.createNewFile();
			}
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			for(int i =0; i <dssp.size();i++)
			{	
				bw.write(line);
			}
			System.out.println("Hoan Thanh!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	*/
	/*
	public void write_1()
	{
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			SANPHAM sp = new SANPHAM();
			ArrayList<SANPHAM> dssp = new ArrayList<SANPHAM>();
			File file = new File(FILENAME);
			String line = sp.getMaSP()+";"+sp.getTenSP()+";"+sp.getGia()+";"+sp.getSl()+";"+sp.getDvt();
			//  kiểm tra nếu file chưa có thì tạo file mới
			if (!file.exists()) {
				file.createNewFile();
			}
			// true = nối thêm dữ liệu vào file
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			bw.write(line);
			System.out.println("Hoan Thanh!!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
	}
}
	*/
	public void readfile_nv()
	{
		ArrayList<NhanVien> dsnv = new ArrayList<NhanVien>();
		try 
		{
			File f = new File("nhanvien.txt");
			FileReader fr = new FileReader(f);
			 BufferedReader br = new BufferedReader(fr);
			  String line = br.readLine();
	            while(line != null) 
	            {
	            	  String arr[] = line.split("[,]+");
	            	  NhanVien nv = new NhanVien(arr[0], arr[1],Integer.parseInt(arr[2]), arr[3], Integer.parseInt(arr[4]));	
	            	  nv.xuatNV();
	            	  dsnv.add(null);
	            	  line = br.readLine();
	            }
	            br.close();
	            fr.close();
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void writefile_nv(List<NhanVien> list)
	{
		
		try 
		{
			File f = new File("nhanvien.txt");
			FileWriter fw = new FileWriter(f);
			 PrintWriter pw = new PrintWriter(fw);
			 for(NhanVien nv :list) 
			 {
				 String line = nv.getMaNV()+","+nv.getTenNV()+","+nv.getTuoi()+","+nv.getQuequan()+","+nv.getCmnd();
				 pw.println(line);
			 }
				 pw.close();
	            fw.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
}
