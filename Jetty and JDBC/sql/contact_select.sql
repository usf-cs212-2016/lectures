SELECT
CONCAT(first, ' ', last) AS 'name',
CONCAT(usfid, '@usfca.edu') AS 'email',
IFNULL(twitterid, '') AS 'twitter',
GROUP_CONCAT(course ORDER BY course SEPARATOR ', ') AS 'courses'
FROM contact_names
NATURAL LEFT OUTER JOIN contact_twitter
NATURAL LEFT OUTER JOIN contact_courses
GROUP BY contact_names.usfid
ORDER BY contact_names.last;
