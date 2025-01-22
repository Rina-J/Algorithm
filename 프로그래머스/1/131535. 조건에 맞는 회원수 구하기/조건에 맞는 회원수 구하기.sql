SELECT count(*)
from USER_INFO 
where JOINED like concat('2021','%') and AGE >= 20 and AGE <= 29;