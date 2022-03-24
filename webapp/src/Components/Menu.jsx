import React from "react";
import { Link } from "react-router-dom";

export default function Menu() {
    return (
        <>
               <div className="central">
                    <p > <img src="./img/tel.png" alt="" /> Central de atendimento: (71) 3245-6789. / Televendas: 0800 123 4567.</p>
                </div>
        <nav className="navbar navbar-expand-lg topo">
            
            <a className="navbar-brand" href="#">
            < img className="logo-menu" src='../img/logo.png' style={{width:"200px"}} alt="" />
            </a>
                <button className="navbar-toggler navbar-light" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Alterna navegação">
                <span className="navbar-toggler-icon"></span>
                </button>

                    <div className="collapse navbar-collapse "  id="navbarNav">

                        <ul className="navbar-nav">

                            <li className="nav-item active">
                            <Link className="menu" to="/">Home</Link><br/>
                            </li>
                            <li className="nav-item active">
                            <Link className="menu" to="/Passagens">Passagens</Link><br/>
                            </li>
                            <li className="nav-item active">
                            <Link className="menu" to="/Pacotes">Pacotes</Link><br/>
                            </li>
                            <li className="nav-item active">
                            <Link className="menu" to="/Cadastro">Cadastro</Link> 
                            </li>
                      </ul>
              </div>
        </nav> 
        </>
    );
}