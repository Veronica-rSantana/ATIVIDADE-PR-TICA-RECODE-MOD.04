import React from "react";

export default function Footer() {
    return (
        <>
            
                <footer className="estilo">
                    <div className="contato">
                        <p><b>Contato</b><br/>
                           <img className="icones" src="./img/iconetel.jpg" alt="" />  Tel.:(71)3456-1234.<br/>
                           <img className="icones" src="./img/email.png" alt="" />  E-mail:vsagencia@gmail.com<br/>
                            Endereço: Av. Estados Unidos,Edf.Margarida,1502,sala 03.<br/>
                            Salvador-BA.
                        </p>
                    </div>
                    <div className="Informacao">
                        <p>
                            <b>Informações</b><br/>
                            Desenvolvido por: Verônica Santana.<br/>
                            Curso: Desenvolvedor Full Stack.<br/>
                            Recode Pro.<br/>                        
                            Turma: manhã 03.
                            
                        </p>
                    </div>
                    <div className="pagamento">
                        <p><b>Formas de Pagamento</b></p>
                            <img className="imagem-pagamento" src="\img\pagamento.jpg"/>
                    </div>
                </footer>
            
        </>
    );
}
