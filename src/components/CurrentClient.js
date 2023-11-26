import React, { useState } from "react";
import Checklist from "./Checklist";

const CurrentClient = (props) => {
    const [activeButton, setActiveButton] = React.useState("");
    const [name, setName] = React.useState(props.client.name);
  //   const handleChange = (e) => {
  //     const { name, value, type, checked } = e.target;
  //     setprops.client((prevData) => ({
  //       ...prevData,
  //       [name]: type === "checkbox" ? checked : value,
  //     }));
  //   };

  //   const handleSubmit = (e) => {
  //     e.preventDefault();
  //     // Обработка отправки формы
  //     console.log("Отправка данных:", props.client);
  //   };
  const handleInputChange = (value) => {
    setActiveButton("saveButton_active")
    setName(value)
    // Здесь вы можете добавить логику, которая будет устанавливать isFormDisabled
    // в true или false в зависимости от значений ваших инпутов и других условий.
  };

  const handleSubmit = () => {
    setActiveButton("saveButton_inactive")
    // Здесь вы можете добавить логику, которая будет устанавливать isFormDisabled
    // в true или false в зависимости от значений ваших инпутов и других условий.
  };


  const handleMailClick = () => {
    // Здесь можно добавить логику для перенаправления пользователя в почтовый клиент
    // Например, открыть почтовый клиент пользователя в новой вкладке
    window.open(`mailto:${props.client.email}`, "_blank");
  };
  return (
    <div className="current">
      <button className="mail__button" title="Связь с клиентом"
        onClick={handleMailClick}
      />
      <h2 className="current__title">Анкета участника сделки</h2>
      <form className={`current__form`}>
        <label className="form__label" >
          ФИО:
          <input  className="form__input"onChange={(event) => handleInputChange(event.target.value)} type="text" name="fullName" value={name} />
        </label>

        {/* Другие поля формы аналогично */}

        <label className="form__label">
          Ежемесячный подтвержденный доход по месту работы:
          <input  className="form__input"onChange={(event) => handleInputChange(event.target.value)} type="number" name="monthlyIncome" value={props.client.dsti} />
        </label>

        <label className="form__label">
          Основной источник доходов:
          <input  className="form__input input_wrong"onChange={(event) => handleInputChange(event.target.value)}
            type="text"
            name="monthlyIncome"
            value={props.client.conditions.income_type}
          />
        </label>

        <label className="form__label" >
          Дополнительный доход подтвержден документально:
          <input  className="form__input"onChange={(event) => handleInputChange(event.target.value)}
            type="checkbox"
            name="hasAdditionalIncome"
            checked={props.client.hasAdditionalIncome}
          />
        </label>

        {/* Другие поля формы аналогично */}

        <button className={`saveButton ${activeButton}`} type="submit" onSubmit={handleSubmit}>Сохранить изменения</button>
      </form>
      <Checklist></Checklist>
    </div>
  );
};

export default CurrentClient;
