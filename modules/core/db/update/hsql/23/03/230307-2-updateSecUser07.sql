alter table SEC_USER add constraint FK_SEC_USER_ON_COUNTRY foreign key (COUNTRY_ID) references CARSCUBAPLATFORM_COUNTRY(ID);
create index IDX_SEC_USER_ON_COUNTRY on SEC_USER (COUNTRY_ID);
