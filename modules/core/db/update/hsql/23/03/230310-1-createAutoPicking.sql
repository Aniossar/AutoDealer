create table CARSCUBAPLATFORM_AUTO_PICKING (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PICKING_NAME varchar(100),
    PRICE double precision,
    CAR_TYPE varchar(50),
    COMMENT_ varchar(255),
    CAR_BRAND_ID varchar(36) not null,
    --
    primary key (ID)
);