import React, { useState } from "react";

const CurrentClient = (props) => {
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

  const handleMailClick = () => {
    // Здесь можно добавить логику для перенаправления пользователя в почтовый клиент
    // Например, открыть почтовый клиент пользователя в новой вкладке
    window.open(`mailto:${props.client.email}`, "_blank");
  };
  console.log(props.client);
  return (
    <div>
      <button className="mail__button" title="Связь с клиентом"
        onClick={handleMailClick}
      />
      <form className={`current__form`}>
        <label className="form__input">
          ФИО:
          <input type="text" name="fullName" value={props.client.name} />
        </label>

        {/* Другие поля формы аналогично */}

        <label className="form__input">
          Ежемесячный подтвержденный доход по месту работы:
          <input type="number" name="monthlyIncome" value={props.client.dsti} />
        </label>

        <label className="form__input">
          Основной источник доходов:
          <input
            type="text"
            name="monthlyIncome"
            value={props.client.conditions.income_type}
          />
        </label>

        <label className="form__input">
          Дополнительный доход подтвержден документально:
          <input
            type="checkbox"
            name="hasAdditionalIncome"
            checked={props.client.hasAdditionalIncome}
          />
        </label>

        {/* Другие поля формы аналогично */}

        <button type="submit">Отправить заявку</button>
      </form>
    </div>
  );
};

export default CurrentClient;
