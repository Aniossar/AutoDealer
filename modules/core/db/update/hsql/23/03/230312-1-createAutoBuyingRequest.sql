create table CARSCUBAPLATFORM_AUTO_BUYING_REQUEST (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CAR_ID varchar(36),
    LEGAL_PERSONAL_INFO_ID varchar(36),
    IS_AUTO_BOUGHT boolean,
    PRICE double precision,
    MANAGER_ID varchar(36),
    --
    primary key (ID)
);