create table CARSCUBAPLATFORM_LEGAL_PERSONAL_INFO (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LEGAL_NAME varchar(255),
    I_NN_ADDRESS longvarchar,
    PERSONAL_NAME varchar(255),
    PHONE_NUMBER integer,
    --
    primary key (ID)
);