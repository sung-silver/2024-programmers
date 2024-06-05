SELECT distinct(cc.CAR_ID) FROM CAR_RENTAL_COMPANY_CAR cc
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY ch
ON cc.CAR_ID = ch.CAR_ID
WHERE cc.CAR_TYPE = '세단' AND MONTH(ch.START_DATE) = 10
ORDER BY cc.CAR_ID DESC;
