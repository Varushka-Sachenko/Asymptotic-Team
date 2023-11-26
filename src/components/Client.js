import React from "react";
import ageIcon from "../images/age.png";
import summIcon from "../images/hand.png";
import incomeIcon from "../images/save-money.png";
import { Link } from "react-router-dom";

function Client(props) {
    console.log(props)
    const handleOpen = () => { props.onCardClick(props.client)}
    
  return (
    <div className="client">
      <h3 className="client__name">{props.client.name}</h3>
      <Link to="/current"> <button className="client__button" onClick={handleOpen}></button></Link>
      <div className="client__conditions">
        <div className="conditions__item">
          <img
            className="condition__image"
            src={summIcon}
            title="Сумма кредита"
            alt="Сумма кредита "
          ></img>
          <span className="conditions__span">{props.client.conditions.summ}</span>
        </div>
        <div className="conditions__item">
          <img className="condition__image" src={ageIcon} title="Возраст" alt="Возраст "></img>
          <span className="conditions__span">{props.client.birth_date}</span>
        </div>
        <div className="conditions__item">
          <img
            className="condition__image"
            src={incomeIcon}
            title="Источник доходов"
            alt="Источник доходов "
          ></img>
          <span className="conditions__span">{props.client.conditions.income_type}</span>
        </div>
      </div>
    </div>
  );
}

export default Client;
