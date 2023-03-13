create table CARSCUBAPLATFORM_CAR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    AUTO_PRODUCER_ID varchar(36),
    CAR_BRAND_ID varchar(36),
    AUTO_PICKING_ID varchar(36),
    NAME varchar(500),
    YEAR_PRODUCE date,
    CAR_PRICE double precision,
    --
    primary key (ID)
);