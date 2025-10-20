package junit_books;

public class Textbook extends Book {
	private int edition;
	Textbook(String title, double price, int edition){
		super(title, price);
		this.edition = edition;
		}
	public int getEdition(){
		return this.edition;
		}
	@Override
	public String getBookInfo(){
		return super.getBookInfo()+"-"+this.getEdition();
		}
	public boolean canSubstituteFor(Textbook other){
		if(this.edition >= other.getEdition() && this.getTitle().equals(other.getTitle())){
	    return true;
	    } else {
	    	return false;
	    	}
		}
	}
