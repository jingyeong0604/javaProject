package exam;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


//매개변수로 받은 HashSet의 정보를 data.txt 파일에 출력하는 makeFile() 메쏘드를 구현하시오.
//
//
//
//<< 제약조건 >>
//메쏘드를 구현할 때, 상품정보(상품 이름, 상품 가격, 제조회사)를 저장하는 Product 클래스는 문제에서 제공되는 Product 클래스를 이용하여 구현한다. 
//
//<< 주의사항 >>
//1. 제공되는 main() 메쏘드는 수정하지 않고 실행한다.
//2. 제공되는 Product 클래스는 수정하지 않고 그대로 사용한다. 
//3. 프로그램 실행 후에 makeFile() 메쏘드에 의해 생성되는 파일은 src폴더에 저장되어야 한다.  
//4. HashSet은 제네릭스를 사용하지 않는다.
//5. 힌트) Object를 입출력하기 위해 
//FileInStream ,ObjectInputStream, FileOutputStream,ObjectOutputStream 클래스를 이용한다. 
//6. ObjectInputStream 오류시 EOFException 처리를 추가한다. 
//
//<< 실행결과 >>
 

public class Prob4 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Product[] prodList = {
				new Product("NT450R5E-K24S",500000,"삼성전자"),
				new Product("15UD340-LX2CK",400000,"LG전자"),
				new Product("G2-K3T32AV",600000,"HP") };
		HashSet<Product> product_hs = makeHashSet(prodList, 500000);
		makeFile(product_hs);
		readFile();
		
	}

	//매개변수로 받은 Product 배열에서 특정 금액 이상의 상품만 선택하여 HashSet에 저장하여 리턴하는 makeHashSet() 메쏘드와 
	private static HashSet<Product> makeHashSet(Product[] prodList, int price) {
		//구현하시오...return값 수정하기 
//		Set set=new HashSet();
//		
//		for(Product p: prodList) {
//			if(p.getPrice()>=price) {
//				set.add(p);
//			}
//		}
//		
		HashSet<Product> plist = new HashSet<>();
		for (Product p : prodList) {
			if (p.getPrice() >= price) {
				System.out.println(plist.add(p));
			}
		}
		return plist;
	}

	private static void makeFile(HashSet<Product> resultList) throws IOException  {
		//구현하시오.makeFile() 메쏘드에 의해 생성되는 파일은 src폴더에 저장되어야 한다.  
		 
		
		try(
				FileOutputStream fos=new FileOutputStream("aa.dat"); //괄호 사이에 넣으면 반납이 자동으로 된다.
				ObjectOutputStream oos=new ObjectOutputStream(fos);){//확장자 아무거나 써도 됨.  ex) aa.dat){
				for(Product pro: resultList) {
					oos.writeObject(pro);
				}
				
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1){
			
		}
	}
	private static void readFile() throws ClassNotFoundException  {
		//구현하시오. 
		//힌트) Object를 입출력하기 위해 
		//FileInStream ,ObjectInputStream, FileOutputStream,ObjectOutputStream 클래스를 이용한다. 
		//6. ObjectInputStream 오류시 EOFException 처리를 추가한다. 
	 //괄호 사이에 넣으면 반납이 자동으로 된다.

		
		try(	FileInputStream fos=new FileInputStream("aa.dat");
				ObjectInputStream ois=new ObjectInputStream(fos);){
				while(true) {
					try {
					Object obj =ois.readObject();
					if(obj instanceof Product pro) {
						System.out.println(pro);
					}
					}catch(EOFException ex) {
						
					}
				}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e1) {
			e1.printStackTrace();
		}catch(ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		
	}

}


class Product implements Serializable{
	private String model_name;
	private int price;
	private String company;
	
	
	public Product(String model_name, int price, String company) {
		super();
		this.model_name = model_name;
		this.price = price;
		this.company = company;
	}


	public String getModel_name() {
		return model_name;
	}


	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Product [model_name=" + model_name + ", price=" + price
				+ ", company=" + company + "]";
	}
	
	

}
