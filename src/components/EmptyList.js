import React from "react";
import empty from "../images/no-task.png"
import { Link } from "react-router-dom";
function EmptyList(props) {

   const handleToMain = () => {
    console.log(typeof props.onClick)
    props.onClick()
   }

    
  return (
    <div className="emptySection">
        <img className="empty__image" src={empty} alt="Список пуст"></img>
        <p className="empty__text">Список текущих клиентов пуст</p>
        <Link to="/"><button className="empty__button" onClick={handleToMain}>К списку клиентов</button></Link>
    </div>
  );
}

export default EmptyList;
