/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
  let ss = s.split("").sort().join("");
  let ts = t.split("").sort().join("");
  return ss===ts
};