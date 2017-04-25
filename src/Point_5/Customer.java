
package Point_5;


public class Customer extends DomainObject{
  private String CompleteName;
  private String telephone;
  private String Street1;
  private String Strret2;
  private String city;
  private String state;
  private String zipcode;
  private String country;
  public Customer(String a,String b){
  super(a);
  this.id=b;
  }
}
