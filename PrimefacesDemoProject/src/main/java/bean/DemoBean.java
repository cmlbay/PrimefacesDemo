/**
 * 
 */
package bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.DemoModel;

/**
 * @author cbayraktar
 *
 */
@ManagedBean(name = "demoBean")
@ViewScoped
public class DemoBean {
	private DemoModel model = new DemoModel();
	
	@PostConstruct
	public void intit() {
		
	}
	
	public void sendButtonListener(){
		System.out.println(model.getName());
		System.out.println(model.getSurname());
	}

	public DemoModel getModel() {
		return model;
	}

	public void setModel(DemoModel model) {
		this.model = model;
	}
	
}
