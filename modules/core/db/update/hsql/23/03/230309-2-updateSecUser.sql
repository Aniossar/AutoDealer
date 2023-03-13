alter table SEC_USER alter column DTYPE rename to DTYPE__U87341 ^
alter table SEC_USER alter column COUNTRY_ID rename to COUNTRY_ID__U40200 ^
alter table SEC_USER drop constraint FK_SEC_USER_ON_COUNTRY ;
drop index IDX_SEC_USER_ON_COUNTRY ;
