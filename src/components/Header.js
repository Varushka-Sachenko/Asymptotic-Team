import React from "react";
import logo from "../images/Group 4.png";
function Header(props) {
  //console.log(props)
  return (
    <header className="header">
      <img className="header__logo" src={logo} alt="Логотип" />
      <div className="progress-bar">
        <div className="task task_not-done" title="Не сделано"></div>
        <div className="task task_in-progress" title="В процессе"></div>
        <div className="task task_done" title="Сделано"></div>
      </div>
    </header>
  );
}

export default Header;
