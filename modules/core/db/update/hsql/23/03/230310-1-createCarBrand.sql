create table CARSCUBAPLATFORM_CAR_BRAND (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    AUTO_PRODUCER_ID varchar(36),
    CAR_MAKER_ID varchar(36),
    --
    primary key (ID)
);