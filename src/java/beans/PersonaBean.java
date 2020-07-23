package beans;

import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import model.Persona;

@Named(value = "personaBean")
@RequestScoped
public class PersonaBean implements  Serializable{

   private Persona persona = new Persona();
    
    
    public PersonaBean() {
    }

    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public String enviar() { 
        if (persona.getNombre().isEmpty() || persona.getApellido().isEmpty()) { 
            return "fallo"; // fallo.xhtml  
        } else { 
            return "exito"; // exito.xhtml
        } 
    }
}
