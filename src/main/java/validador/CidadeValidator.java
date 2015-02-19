/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validador;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import service.Cidade;

/**
 *
 * @author Izaquiel
 */
@FacesValidator(value = "cidadeValidador")
public class CidadeValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {

        if (value instanceof Cidade) {
            try{
            System.out.println("Deu Certo!");
            System.out.println(value);
            }catch(RuntimeException e){
                e.printStackTrace();
            }
        } else {
            System.out.println("Nao deu certo!");
        }
    }

}
