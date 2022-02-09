import React from "react";

export default function Cadastro() {
    return (
        <>
          <div className="imgFundo"/>
             <form className="cadastro">
                <h2>Informe seus dados para realizar o cadastro.</h2>
                    <label  for="nome">Nome completo:</label><br/>
                    <input type='jsx-a11/alt-text' id="nome"/>
                    <br/>
                    <label for="cpf">CPF:</label><br/>
                    <input type="text" id="cpf"/>
                    <br/>
                    <label  for="email">E-mail:</label><br/>
                    <input type="text" id="email"/>
                    <br/>
                    <label for="telefone">Telefone:</label><br/>
                    <input type="text" id="telefone"/>
                    <br/>
                    <label for='idade'>Data de Nascimento:</label><br/>
                    <input type="date" name="datavolta"></input>                  
                    <br/>
                    <label for="endereco">Endereço:</label><br/>
                    <input type="text" id="endereco"/>
                    <br/>
                    <label for="bairro">Bairro:</label><br/>
                    <input type="text" id="bairro"></input>
                    <br/>
                    <label for="cep">Cep:</label><br/>
                    <input type="text" name="cep" size="5" maxlength="5"/> - 
                    <input type="text" name="cep" size="5" maxlength="3"/>
                    <br/>
                    <label for="cidade">Cidade:</label><br/>
                    <input type="text" id="cidade"/>
                    <br/>
                    <label for="estado"> Estado: </label><br/>
                    <input type="text" id="estado"/>
                    <br/>
                    <input type="button"value="Enviar"/>
                <br/>  
            </form> 
            
        </>
    );
}
     
        
      