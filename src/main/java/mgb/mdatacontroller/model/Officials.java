package mgb.mdatacontroller.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import mgb.mdatacontroller.model.example.Product;

@XmlRootElement(name = "products")
public class Officials
{
  List<Product> products;

  public List<Product> getProducts()
  {
    return products;
  }

  @XmlElement(name = "product")
  public void setProducts(List<Product> products)
  {
    this.products = products;
  }

  public void add(Product product)
  {
    if (this.products == null)
    {
      this.products = new ArrayList<Product>();
    }
    this.products.add(product);
  }
}