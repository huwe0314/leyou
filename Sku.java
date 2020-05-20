public class Sku{
	private Long skuId;
	private String title;
	private Long price;
	private String images;

	public void bugMsg(){
		system.out.println("this is bug!")
	}
	
	
	pubic Long getTitle(){
	  return this.title;
	}
	
	pubic Long getImages(){
	  return this.images;
	}
	public void msg(){
		system.out.println("this is master!");
	}
}

