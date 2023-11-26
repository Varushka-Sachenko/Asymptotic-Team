import React from "react";
import logo from "../images/Group 5.png";
import { Link } from "react-router-dom";
function Header(props) {
  const [isActive1, setIsActive1] = React.useState(props.statusButton1);
  const [isActive2, setIsActive2] = React.useState("");
  const [isActive3, setIsActive3] = React.useState(props.statusButton2);
  if (props.status === "active"){
    setIsActive1("clientList__item_active")
    setIsActive2("")
    setIsActive3("")
  }
  // const [isClick, setIsClick] = React.useState(false)
  const handleMenuClick1 = () => {
    setIsActive1("clientList__item_active");
    setIsActive2("")
    setIsActive3("")
  };
  const handleMenuClick2 = () => {
    setIsActive1("");
    setIsActive2("clientList__item_active")
    setIsActive3("")
  };
  const handleMenuClick3 = () => {
    setIsActive1("");
    setIsActive2("")
    setIsActive3("clientList__item_active")
  };
  //console.log(props)
  return (
    <header className="header">
      <div>
        <img className="header__logo" src={logo} alt="Логотип" />
        {/* <div className="progress-bar">
          <div className="task task_not-done" title="Не сделано"></div>
          <div className="task task_in-progress" title="В процессе"></div>
          <div className="task task_done" title="Сделано"></div>
        </div> */}
      </div>
      <nav className="clientList__menu">
        <Link to="/">
          <h2 className={`clientList__item ${isActive1}`} onClick={handleMenuClick1}>Новые заявки</h2>
        </Link>
        
        <Link to="/current">
          <h2 className={`clientList__item ${isActive3}`} onClick={handleMenuClick3}>
            В работе
          </h2>
        </Link>
      </nav>
    </header>
  );
}

export default Header;
