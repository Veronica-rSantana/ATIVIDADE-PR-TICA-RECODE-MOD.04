import React from "react";


export default function Destino() {
    return (
       <>     
            <div className="Formulario">  
                <form  className="passagens">
                    <h3 align="center">Programe sua próxima viagem conosco!</h3>
                    <label  for="localPartida">Origem:</label>
                    <input type="text" id="cidadePartida"/>                       
                    <label  for="localDestino">Destino:</label>
                    <input type="text" id="estadoPartida"/>                        
                    <label  for="ida">Data ida:</label>
                    <input type="date" name="dataida"></input>                        
                    <label  for="volta">Data volta:</label>
                    <input type="date" name="datavolta"></input>                                            
                    <input type="button" value="Buscar"/>   
                </form>                
             </div>                             
        </>  
    );
}