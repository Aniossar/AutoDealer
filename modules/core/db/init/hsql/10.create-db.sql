-- begin CARSCUBAPLATFORM_COUNTRY
create table CARSCUBAPLATFORM_COUNTRY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    CODE integer,
    --
    primary key (ID)
)^
-- end CARSCUBAPLATFORM_COUNTRY
-- begin SEC_USER
alter table SEC_USER add column COUNTRY_ID varchar(36) ^
alter table SEC_USER add column DTYPE varchar(31) ^
update SEC_USER set DTYPE = 'carscubaplatform_ExtUser' where DTYPE is null ^
-- end SEC_USER
-- begin CARSCUBAPLATFORM_AUTO_PRODUCER
create table CARSCUBAPLATFORM_AUTO_PRODUCER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    COUNTRY_ID varchar(36),
    PRODUCER_CODE integer not null,
    --
    primary key (ID)
)^
-- end CARSCUBAPLATFORM_AUTO_PRODUCER
-- begin CARSCUBAPLATFORM_COLOR
create table CARSCUBAPLATFORM_COLOR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(100) not null,
    CODE integer,
    --
    primary key (ID)
)^
-- end CARSCUBAPLATFORM_COLOR
-- begin CARSCUBAPLATFORM_AUTO_PICKING
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
)^
-- end CARSCUBAPLATFORM_AUTO_PICKING
-- begin CARSCUBAPLATFORM_CAR_BRAND
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
    --
    primary key (ID)
)^
-- end CARSCUBAPLATFORM_CAR_BRAND
-- begin CARSCUBAPLATFORM_CAR
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
    YEAR_PRODUCE integer,
    CAR_PRICE double precision,
    --
    primary key (ID)
)^
-- end CARSCUBAPLATFORM_CAR
-- begin CARSCUBAPLATFORM_LEGAL_PERSONAL_INFO
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
    PHONE_NUMBER varchar(7),
    --
    primary key (ID)
)^
-- end CARSCUBAPLATFORM_LEGAL_PERSONAL_INFO
-- begin CARSCUBAPLATFORM_AUTO_BUYING_REQUEST
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
)^
-- end CARSCUBAPLATFORM_AUTO_BUYING_REQUEST
