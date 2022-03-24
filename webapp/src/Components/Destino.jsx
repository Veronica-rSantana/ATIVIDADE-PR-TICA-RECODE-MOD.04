import React from "react";


export default function Destino() {
    return (
       <>     
            <div className="Formulario">  
                <form  className="passagens">
                    <h3 align="center">Programe sua próxima viagem conosco!</h3>                
                    <div class="row">
                        <div class="col">
                            <input type="text" class="form-control" placeholder="Origem"/>
                        </div>
                        <div class="col">
                            <input type="text" class="form-control" placeholder="Destino"/>
                        </div>
                        <div class="col">
                            <input type="date" class="form-control" placeholder="Data Ida"/>
                        </div>
                        <div class="col">
                            <input type="date" class="form-control" placeholder="Data Volta"/>
                        <br/>
                            <button type="button" class="btn btn-outline-primary">Enviar</button>            
                        </div>                       
                    </div>
                </form>                                              
             </div>                                        
        </>  
    );
}