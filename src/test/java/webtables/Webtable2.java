package webtables;

public class Webtable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String text="Showing 1 to 10 of 18021 (1803 Pages)";
		String text="Showing 1 to 10 of 99 entries";
		
		//int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		//int total_pages=Integer.parseInt(text.substring(text.indexOf(9)+1,text.indexOf("entries")-1));
		String total_pages=text.substring(19,21);
		int tle=Integer.parseInt(total_pages);
		
		System.out.println("Total number of pages:"+tle);
	}

}
