package pretend;

public class AnyuWAF {
    private static String Html;
    private static String Code;

    public static String GetHtml(){

        Html = "CjwhRE9DVFlQRSBodG1sPgo8aHRtbCBsYW5nPSJlbiI+CjxoZWFkPgogICAgPG1ldGEgY2hhcnNldD0iVVRGLTgiPgoJPG1ldGEgbmFtZT0idmlld3BvcnQiIGNvbnRlbnQ9IndpZHRoPWRldmljZS13aWR0aCwgaW5pdGlhbC1zY2FsZT0xIj4KICAgIDx0aXRsZT40OTM8L3RpdGxlPgogICAgPHN0eWxlPgogICAgKnsKICAgICAgICBtYXJnaW46IDA7CiAgICAgICAgcGFkZGluZzogMDsKICAgICAgICBmb250LWZhbWlseTogTWljcm9zb2Z0IFlhSGVpOwogICAgICAgIGJveC1zaXppbmc6IGJvcmRlci1ib3g7CiAgICB9CiAgICBodG1sLGJvZHl7CiAgICAgICAgd2lkdGg6IDEwMCU7CiAgICAgICAgaGVpZ2h0OiAxMDAlOwoJCW1hcmdpbjogMDsKCQlwYWRkaW5nOiAwOwogICAgfQogICAgYm9keXsKICAgICAgICBiYWNrZ3JvdW5kLXNpemU6IDEwMCUgMTAwJTsKICAgICAgICBiYWNrZ3JvdW5kLXJlcGVhdDogbm8tcmVwZWF0OwogICAgICAgIGJhY2tncm91bmQtYXR0YWNobWVudDogZml4ZWQ7CiAgICB9CiAgICAubWFpbnsKICAgICAgICB3aWR0aDogOTklOwogICAgICAgIHBhZGRpbmctdG9wOiAxMCU7CiAgICB9CiAgICAubWFpbiAuY29udGVudHsKICAgICAgICBtYXJnaW46IDAgYXV0bzsKICAgICAgICBwYWRkaW5nLXRvcDogNSU7CiAgICAgICAgdGV4dC1hbGlnbjpjZW50ZXI7CiAgICB9CiAgICAubWFpbiBwewogICAgICAgIGNvbG9yOiAjNjY2NjY2OwogICAgICAgIGZvbnQtc2l6ZTogMThweDsKICAgICAgICBtYXJnaW4tYm90dG9tOiA2cHg7CiAgICB9CiAgICAuYnV0dG9uewogICAgICAgIGZvbnQtc2l6ZTogMDsKICAgICAgICBtYXJnaW46MjBweCBhdXRvIDA7CiAgICB9CiAgICAuYnV0dG9uIGF7CiAgICAgICAgZGlzcGxheTogaW5saW5lLWJsb2NrOwogICAgICAgIGxpbmUtaGVpZ2h0OiA1MHB4OwogICAgICAgIGhlaWdodDogNTBweDsKICAgICAgICB3aWR0aDogMjIwcHg7CiAgICAgICAgdGV4dC1hbGlnbjogY2VudGVyOwogICAgICAgIGJhY2tncm91bmQ6ICMwMDhERkY7CiAgICAgICAgY29sb3I6ICNmZmZmZmY7CiAgICAgICAgdGV4dC1kZWNvcmF0aW9uOiBub25lOwogICAgICAgIGZvbnQtc2l6ZTogMThweDsKICAgICAgICBtYXJnaW4tbGVmdDogMTBweDsKICAgICAgICBib3JkZXItcmFkaXVzOjVweDsKICAgIH0KICAgIC5idXR0b24gYTp2aXNpdGVkewogICAgICAgIGNvbG9yOiAjZmZmZmZmOwogICAgfQogICAgLmJ1dHRvbiBhOmhvdmVyewogICAgICAgIGJhY2tncm91bmQ6ICMwN0ExRkY7CiAgICB9CiAgICAuZm9vdGVyewogICAgICAgIHdpZHRoOiAxMDAlOwogICAgICAgIGNvbG9yOiM2NjY2NjY7CiAgICAgICAgZm9udC1zaXplOjE0cHg7CiAgICAgICAgcG9zaXRpb246IGFic29sdXRlOwogICAgICAgIGJvdHRvbTogMzBweDsKICAgIH0KICAgIC5mb290ZXIgLmNvbnRlbnR7CiAgICAgICAgcGFkZGluZy1sZWZ0OiAxNSU7CiAgICB9CiAgICAuZm9vdGVyIHB7CiAgICAgICAgbWFyZ2luLWJvdHRvbTogNXB4OwogICAgICAgIHdvcmQtd3JhcDogYnJlYWstd29yZDsKICAgICAgICB3b3JkLWJyZWFrOiBicmVhay1hbGw7CiAgICB9CiAgICAuZXZlbnR7dGV4dC1hbGlnbjpjZW50ZXI7d2lkdGg6MTAwJTttYXJnaW46MCBhdXRvIDIwcHg7Y29sb3I6IzE4YjlkNjt9CiAgICAuZXZlbnQgcHt0ZXh0LWFsaWduOmNlbnRlcjtjb2xvcjojMThiOWQ2O30KICAgIC5zdGF0dXNDb2RlIHt3aWR0aDogMzE2cHg7aGVpZ2h0OjExN3B4O21hcmdpbi1sZWZ0OiBhdXRvO21hcmdpbi1yaWdodDogYXV0bztiYWNrZ3JvdW5kOiB1cmwoZGF0YTppbWFnZS9wbmc7YmFzZTY0LGlWQk9SdzBLR2dvQUFBQU5TVWhFVWdBQUFUd0FBQUIxQ0FNQUFBRGsrNjBrQUFBQnBGQk1WRVZNYVhFQWpmOEFZc3dBWXN3QVlzd0FZc3dBWXN3QVlzd0FqZjhBamY4QVlzd0FZc3dBWXN3QWpmOEFqZjhBWXN3QVlzd0FqZjhBamY4QWpmOEFqZjhBWXN3QWpmOEFZc3dBamY4QWpmOEFZc3dBWXN3QWpmOEFqZjhBamY4QWhQVUFpZm9BaXZ3QWgvZ0FkdVFBaVBrQWE5WUFpUGtBZmUwQWdmRUFaOUlBYmRrQWl2c0FhOWNBZStrQWZ1NEFidG9BaXZ3QWVPWUFmKzRBaC9nQWpQNEFpL3dBaGZZQWcvTUFmT3NBaHZjQWVPWUFmKzRBZWVnQWQrUUFmT29BaVBrQWlQb0FkdU1BaHZjQWdmRUFndklBaXZzQWkvd0FoZllBalA0QWh2Y0FnL1FBYytBQWpQNEFoZlVBalAwQWFkUUFpdndBWnRFQWlQa0FjdDhBZnU0QWkvMEFoL2dBaGZZQWV1Z0FiTmdBYU5RQWNkNEFpLzBBWnRBQWJ0c0FnUEFBZE9FQWl2c0FqUDRBZ084QWJka0FaYzhBZ084QWhQUUFmdTBBZ2ZFQWl2d0FpZm9BY3Q4QVlzd0FqZi8vLy85QXF2OEFndklBYmRrQWVPWUFpdndBWmM4QWF0WUFoZllBZmV3QVo5SUFpUGtBZ084QWRlSUFjdDhBYjl3QWV1bkE0Lzl2di8vZjhmKy80djgvcWYvditQL1A2dit2Mi84UGxQOHdvdjlmdC84dm92KzhzMWw1QUFBQWJYUlNUbE1BRU1EUUVQQ0FRSUJBSURCZzhNRGdvR0RRNEtDUU1MQWdjSEJRc0pCUW9QZUk0Tzd0bnRoazlZZzk0a3h3a3VqTXVzQ0M5djNZZnB5WUgrMndaUEw5Ky9lK3NPdnozT3ZrclBlZ3hMUDR5TisxVzM3eityajhWOHpXTHRuRXBZanN2K1l1OVBHNDRueFk4TlJZUEZYWVd3QUFBQWx3U0ZsekFBQUxFZ0FBQ3hJQjB0MSsvQUFBRDFCSlJFRlVlSnpOWFdkekk3a1JKU2xtYVVYcFZsbXJEZmFkN1R0ZmNNNDU1NXh6em9CTURqTXB5VHA3OTg3Mm4zWk5CdVkxTUFBR1ZQbDlVWldJUVhqVDNXZzBHcGlhQTA2N01sNTFxYVFFSjczZWV4OUYrRlB2U0YvVUY0NTZ2ZFB1aHg4OWV2VExQL2RPTnRYSVBpOWcySVl5VmREci92cWRoUlllLy9FUHIyeVF0dnJEN3U3OVFwTi8rZXVUaDNVb1dSVW45NEM4VnQ5YjVhZTd4ZHBUakQvM3NXMG83d0ZIRjg5Qld5bCtkdUZaNnJHcElUdUdVazdZeDdwbC9qN3hncmZYRktOK1dwUzRJcjdVOWFqQ1hhaWVEeG5yUURscjFMc2cwZ1RtMy9UUVZBcXpKdm1CTC9wNlVIVkUzaFlVdE1XcDBUZzRId2NOWC9TWlVSZml3b3YxcTFOU1BtU01uVUZSS3h5VktLeUkyZlRZaC9MMnFLR284TDZIOEx3OUhsQ1ZoK1MxbWxXcVBZVTZkUmhmdFNxK0s5cjhhUEZscU1FVzRLVms1TEU5OTFycjVDdlJJV0RIbFY1V3JhNmMxSlY0L2lOUWl4V09hQ01Sa2VjK1o5UXRWRGJGbkEycStDMHVUZklmdmd6MTJFRFJaRXhlNHk0SHd1ZXM1YzZlVzVOODlpTFVaSTRMcUU0a2orM2M1VUQ0bFd1RDdrM3lsYnV4b0x3VWtid1dQR0VDYTN1WFl1VE1ubk9UZkwzbHlGNmRObmc1ZVF3ZU1ZRHRwSmRqUEhIVVhQY21PWjg2c3FkK1h4WElPNExLekxGaXpHVlJyVlFnRXd5WkUzc2FWNndDZVdyck14N2VCRUVRM0F6SDhGT0thK1l3Rk5MTkR6Rzd1WjVHdzVpTTF2TWwvSnhnNUxLT1YzZ3BGY2xUYWRCc1BXVVpGbGNyS0JCaE9YRndMeFZOemhkTXdtZ09SZUtlTVdZZGdOTk9VTTdrS2N4b2NTQ01MUUpTL2dMRzJEblVxZ1VHMUtJUlFJdU1UV2RRak1memxLMmxWWGtwMWNnanBXQTJoWEdFdWtSSjMzaGl2UzQ4Z0VyQ1NSU2FpMEFLMzV5eEFkU3F4VU9vd3dkNXBPRE5ZUXdKcnFCb0xIcUhVSzhHSjFCRjdETFNJTm1iV0NvdU9jcnE1RkZ6a0pJN3hxYW91cUhvV1drUnBVRUt1UXRCYWU2MXBiU1hyS0pkeVNQbVBRMTNqRjFEOFVob2JOYUZoQlNzb0IzaGZVSHB1SXNXb2tkSmlBZnlDQjl2Tm9IK2l3andBV1lWa2lDaVFtTnRrNFNsblZrRjRJaEJlaUdQVUtFUjlGNEdxdEhDU3ZRSVJ6K0FSaGhqVzQxR285R2loWjB6aTNVOGVDbXpvZ2ZwU0I1cUxhVzBqY096VG9SMnU5MTREUjY1c1JHOU9qeU9ndGZhMjhtV0xaM0RBZHJaNkEyYmVzb2dJR0FJM01nakpyNmlrOUk2TE5MeXRlSWpTMllSaUNXY2hodTV4VUZScE40R1Q4U1RzNW5lUW9OcjVvYzh0S1N6a29HUVJtdGhQaFRLeVpQZVZ3dGJKRnpSd0ZodndTTWZNay9rNFVoa240R2UwV0M2akI0eTNOTDREVFM1bEN3ZEVXYkF0eFdUWitSZEZyMlU4Y0lYZVdqeXhEV1NLc29PbEVlZWh0bk81MitoUlVscnlVZ25FWU9KbmpHWnBFQnF3eGZ0aHp6b2xDZ0Z5bWdKU01JNEtxK2dXc2JMd2JENDlIVlprd1I1Z2VGZ3dVdUplQ0wvYVVzZTlrcVlhd2ZrUUdya05ETlY2M2dSMnkwMlhhOUVaeUVYZG9Ycmh0MU15S09MQzREWTEzamhqVHdRSWRIajBnZ1NhUHVWdWQ2RzdFVXhybm5pTUk3ekpoWHVEa0hlV2xjK0J4aVlXTXE5a0FjR1FmQ1FkWElFUzhYWWJCRzJua0xNWGhpbHVRNTFlSmcxcVhMY3NKdEpQOHZJQXk4bFdRWjZJUTllVE80MWFFTStNSnE0ZFZPWHY3a2xXTlpSYnZKVTVCTnJrb2tKZWVDbHBONDQzWDFMOGtDQ2VEWVFMUkZBWHZ5Y2NVUlpZaStEOG5Gd2pkSjVyWVE4R0Y3Nm5yeVE5eTdvbFpIZ29UckVrcUIvU0VTekFkU3BxY0RXMG5sTjlVUU1lTVhaYk9pRnZDOUFyMHdzSG1YQlIxcTlJN0FIM0NtcFIrT1NpcENXUE9qa01sdENleUd2bUhhY2s2ZW5BZnFWQklKdDlqS0FQZFY2QVZ5MWZJTFdrUWRlaWpBWmVpSHZMZEN0Wk1JbzhUcVF2TUJBWGdzNEs2aXVpbmxpMit2R1lMQXd5d2dMbVEyUk45SkxRUUlrTCs2Wnl0ZFFvWE4yM01wR3BQQjRDYVZOM1dwZGJnbTRzTXVKWi9JK0FOMUs0Z0xhdVpZS3hneE5CSlpFZjJkdm9IbVc0aTZWSWMyN0FpOUZpdkhTdmJjazc3UFFyMlJDMHF3dWFsUjRNVzBlU3BxaGVYN1lJQjBWTXVVeWk1MXE0amlnNjFLd1d0Rjd1KzQvZ283TmpHcUJycVhQbFpCdUN6ckJQUE9xMWJNYWVDbHltTklMZVcrSGpoazViRVFrUFptbWRkT2ZMWTR1U09weXc2OVFkTkltVC8yVGgrR1IyT2NvQ1pTQk1jN0kweWlTRlhyN0IrQnBGQWFxTWN5NHhTM3ZNQjJyNm9TYXRIZy85RzFsUUI0c2V6THlYQS9BN1dlSEVDOTJkM2RoN0FMeWpWRzFlb0NobEpXMjFmUkQzaGVoY3diN2lJUzhwdVNWdURoS1VLK0R4Q3AzT0ZSK0lmb0NZem1GNkJ4aXdHN2t2UWM3R0pTU1Iza1BDWG42QjlVd0pVOXdkSlZOWVNLZXZDK3pod0YwTi9JK0R0MkxYcE95WXpYU0d2UE1JbXNmMU1DTXZMRVFzRmNFblNsWFlDaHhGd2JJVlNXZ0xpMmF4SDd5U3M4QnJoa2pqRFpQM28yNE42NTBpc0FITFNodGg3QTdqaGtESDRVdWhoT3VqZ1BGT0dQeWRBc21IUlNWaXBDekxaVXpMZXFGckxTSFZCbEg4cjRLYllWRXFNbXJrd1l2WC8zQUE1N0lXMHJVRVJ2amFmL0E0TWtKV05HdWxpL3l0c21zNlY5QnVRUW5ZRkR1aUR3K3ZoRTIyWlE2aTE1S0lROG04dUo5a1ZkN0szU1RxOCsyYWc3SGJwcThVSWFTTnNpTjhSamdwWWlid3BrZjZvMjhGNGtwZzNOK2Z4OUs2ayt6M3dGNW5LOFdqQTJVL2gwVk41V1ZObG5RZVNPdmo4bUtDWDNTdlFnbis2QVFNaHliVDJEcTU0MC8zVmFMSFNiaUZaVTJVWGR2NU5XK1RWcTlDUGQydTZlOTNzUHVoWGJCRk9OdXlPTjhsellvRWNCTElaWFdKM2tkS3ZIU0huZEZIdi9HaitEcEJMakxKaWYrWlZFWWYrVFZHa1RPNy84eGVYejhZM3F5UlM5bEtTbHRma2JPSTNtZGlWcHh6WEYzNVBIeGxJdy9ZQjF5ZG5VZUx2TklYcTFCSEs0b0FTWjFWeVB2RnlNUjZ5QllRU0theU42Q1NFVkRMMFZXV3NIeDkwbmVOaHRCdzNyTXdVN09xcEdIdTdpTVRhL21xcGM2UXo4WnZaU1pRbW45a2xjN1pGZXFicEtZNDJHTXBIbDFnTEs4RHhTdUZmWTRLRVpWMEVzcFJON0ZHTGRYOHBvRDZsaVVFblBpSk1zUWRNTVdPd1Izb2Z6Uityc29KSkhpa3JzUWVSY0xleVd2dHMzWUFzMFlqWEc0eTNGVC9HbGVtVHdWZTJ4TmRXTW9KMVdobDFLTXZHK092Tm9aUlFpSitEQXBpRU5RbmJ4YXB3WEV4Y0pIYWNWSWpNUGpGbmRCYWVVbG5XZnlJb090MEJBUjR5UTRCaVhYaEhaWVkxdkJIaldmelVWeFFpOUZvN1QreVl2VERVZEFpa3hka0U1Z0lBdUpTMVh4K3NqdEFSQVhBVXhzdk1HY3VudXd4VjJJdkJkRDlyN0pTNU0xUjByM2dNK3U4cmtmZnB4NklVK1JNc29vTi80cVN4bEFMNFhQQXhHUEN2ZXJ3dXl5VEFwSHZ6NzVHM1RMdk4vWDFMVVN3N1VZeWtVOVNuN3d0ZWtkZGFqVDZaeTNENk9EajhTa01VOFRjUldiS3U1NERUMXdjL1lZVzF3SHEvUTZrT1Z3dmk2ZUlvWFQ4dW5aRjUvcEZobjZPOGNUWkdLWjZ1TXA1My8zaDM5elBuTFNIOExOcHdFMmFMaEo4c0lYU3h4OG5DVDdRRjNPTC8zaEg2SDlWbWNRYWJDam1PNktnSGtsbmR5cVhhaW5BYzRKMFJ5MXRSbnkzRHl1YmRwZ0Z3R1RTbm8zQlZUb0MwUnUwVHA1V3hzZ1Q1M0tvY2VaZ2ZEQlNlazB6OVZoYVd0NEJ6SjRGL21SMjAyUTU3cEdiN2FCckNKZzdrdXowKzNFdmQ3cjduTGVnLzlUVUpHM0Y1UDM3RjhoYm9FS005dyt1M3gyZS9uMFAwOHo4dHg5cm1hN1JQcmVVUnhIdWtkRkJpbEpITzBmSkhHUVUrcG5nSXE4clppODIrZy9iNzd1eE4zcmI5NWUzdjczOGczK1JrNWVsZnZPZDQ2QnNReU5IVmhKcGhrTlp1K3IxMzBnMUhBQXYxTlFrY2NTdGYxbkNEZnVMaS9ENTU3R2YxTHk3QmVhUi9zSG1SdzB6L2VvdGRMeFdaOElZYVNyOEZKUHBiNFBsOERmaDBJVU1FNmNrTmZmaU0yejg3cE9IblozWVNqTnpsbTcwWWduNEVHajBUNkxLNFRWVFhaaXRsVFdJVCtKYzI1MGJ6bmhxZ1RKR0RkRW51R2MwZXMreUZjNDViTWZwbk5uQitLZ0xJQllTaGtaUFl5YmJKbzhkU0pXUnNUK0Q3NGxkK2tDeWhTQkdwUnVMUnRNdGlDMW5EOEhoUWlBbVUwTjdYbEludWZsbWFFQlJ5a3FOMEVnUEpuV0dreTJyMEtESnNKT0JVNlNNYlpyVCtDWGlqQU9yejBQN1dDR2p3ejA5VE90TlRqcC9WTjQybWkreFVTSzFESGZVWVpRMVlDZzBKQXFXazdlMTZGUHUxQkdBaEVBeW1JdTlFNitEUEFSamFZTWJEU1Y5NDQ2QUsyRUwvSytBNTBxRVQyVWdld3FGcU9jMm5mRDg1dy9nRklGb0xSbmpubm9BUFROVnVRWmZKRlgrejcwNnI0bUQ0bHlWck1MSzQzOHlwY2dxTUE1TC9uUUJTSHRtV01lZVUrS0FMUUszc2o3RFBSS1o0T0liYW84QmM0c2pQdzlxSUh6ZS9vNWc1aWlzMWhFWEtLcFdSRWh2SkZIaUpKYWNZbDllV0dmeW13NStBTFVFTG9yT21sSDN5amZsODFjV2VOQXJrL3lhcCtIZmluWm83Z2JHNXdGazlDSFNHckVubHIyaU1WRmJpenluZS95WU5BR3lQc2c5RXZsOWZkUVo4VXJlazFES2orQk9rTGNVOWk5RXpxZE4zMW5nbmVreWpoQStDT3Y5aGg2RmpvczREN1FKekNFckFiVGc4bzc1TTNIbk84U2tUM2xkNzFTWXlHYUN0Tk5CSi9rZlFoNkZ1RkFFb1dqQTNvVWVWYURjZkMxK1h0cXdvM28yNWRNWDEyZFJKNjZSL0o1NVg3SERLK295Sk9lTmpQaFg0Ryt4Ymozb0x2ZjY0VVozUTlvNXFTc0J2TkE2Q0ZrOStWNDdpQnVzeXNHS3hDcFgrNzJKUk9ZSkN0a0RId1grbVlLTVJYSlBQVGFwNjhzdDBDYTg2aysrcWlGMTNRTCtoUlFPY1JURGpiYkYzc1QwM3cyR2xuT0oza2p4aDJUMTFIa1g1WmdMS1p4Mld6VzlkbENaZmJzM3BualJvUGZSSitmTzBtQ2VFTEVicTl1ajg2NU0rUXVlMmV1aC9MOWt0ZDMwS094OUJFR084dmRiTG16TjhzeWpweS96dWc1eGF4dHpaNmtzOWFieEczbFIxYktNTXp0ckhOS2x1Lzh2SzBKdVdwU1lnWm56eTNiVTN6WHBReUNiK1Nld3V1YnZINExVNTgwdUpGUEU5cVBZenQ4YkcycnVrTkIzQ3RzUzN2UEREMW5iRVFrTlpMNFpDRmZ6MlVjMFRwK1lTVjhTK2tNbzJNdVRtMFQ1RVdqb2I4dlZjQmorRnlQay9HSnJ4NHN5WUlXQjNoVnZjMEUvc21MSW1LVG9FejZQZ1hVT2FiQXA5SGZxY2x5WTNsVCtOSkVoUy81Ym9TOEpKNTRyVTdweGpFdzVYM3U1Y2p2bWxaOWtDN0JMSUJXSzNHSGw3ZDVJQytMeG80QzR2dUV5OVVheHNBcUdXNXgxMnNVckNpWm42MEM2cXM2MWJpcnZmUzdrWXgwWUZEU0JzTHB1Y25vV2tqR0gxRkRpTG1yY045Z2NjOXdOSW9haXo4d0dZeEdxczhxdWE0c01xaTIyNkNnRll6amlUNjRzOTcxU3VENlBlTHlocUdjSFF5VGtsTzQycnRzRURiN05qRlVYeml4YkppNklyeDZTclhGUmdvN3JKNzlmbTRwNng2YWpFRzlOaWhralQ3NVVnam9yb2N4aDBFT2RJNHRqd2M5Q1BhZ2pBTTZKdlMxZE5mRFdLRy9aeWg5MUtld0tnQzMyKzVvUEFOdjFJVm83aGlZMmkyLzFGSHNRUWxYMERuSkVWcDdYaFJXUWwrODZSd3hPUFI4QlhPRTR2Rm9LRkFCMnp1SG9NQ0Q0L2FtRHBqVnRzL2J4OUJnMk9UWkpwZ0xVZGlzOU45QS9JbkhFSjNPcGdZaElSelJlZExrbVg1RXRWcnRmMktiQ09BYUo3MWlBQUFBQUVsRlRrU3VRbUNDKTt9CiAgICA8L3N0eWxlPgo8L2hlYWQ+Cjxib2R5PgogICAgPGRpdiBjbGFzcz0ibWFpbiI+CiAgICAgICAgPGRpdiBjbGFzcz0ic3RhdHVzQ29kZSI+PC9kaXY+CiAgICAgICAgPGRpdiBjbGFzcz0iY29udGVudCI+CiAgICAgICAgICAgIDxkaXYgY2xhc3M9ImV2ZW50Ij4KICAgICAgICAgICAgICAgIDxwPuaCqOeahElQOiA0Ni4xMjIuMzUuOTk8L3A+CiAgICAgICAgICAgICAgICA8cCBpZD0iZXZlbnRJRCI+ZXZlbnRJRDogMTI0OS0xNzk4NzgyNzQ5LjY4Ni13YWYwMWJqdHAzPC9wPgogICAgICAgICAgICA8L2Rpdj4KICAgICAgICAgICAgPHA+5oqx5q2J77yB5oKo55qE6K6/6Zeu5Y+v6IO95a+5572R56uZ6YCg5oiQ5aiB6IOB77yM5bey6KKr5LqR6Ziy5oqk5oum5oiq77yBPC9wPgogICAgICAgICAgICA8ZGl2IGNsYXNzPSJidXR0b24iPgogICAgICAgICAgICAgICAgPGEgaHJlZj0iamF2YXNjcmlwdDpnb0hvbWUoKSI+6L+UIOWbnjwvYT4KICAgICAgICAgICAgPC9kaXY+CiAgICAgICAgPC9kaXY+CiAgICA8L2Rpdj4KICAgIDxkaXYgY2xhc3M9ImZvb3RlciI+CiAgICAgICAgPGRpdiBjbGFzcz0iY29udGVudCI+CiAgICAgICAgICAgIDxkaXY+CiAgICAgICAgICAgICAgICA8cD7mi6bmiKpVUkzvvJo8c3BhbiBpZD0id3VybDEiPjwvc3Bhbj48L3A+CiAgICAgICAgICAgICAgICA8cD7lpoLmnpzmgqjmmK/nq5nplb/vvIzor7fmt7vliqDor6V1cmzliLDkupHpmLLmiqQgLSDpmLLngavlopnnu7/oibLpgJrpgZPvvIzkvb/mgqjnmoTorr/pl67kuI3lho3ooqvmi6bmiKo8L3A+CiAgICAgICAgICAgIDwvZGl2PgogICAgICAgIDwvZGl2PgogICAgPC9kaXY+CgogICAgPHNjcmlwdCAgdHlwZT0idGV4dC9qYXZhc2NyaXB0Ij4KICAgICAgICBmdW5jdGlvbiBnb0hvbWUoKXsKICAgICAgICAgICAgd2luZG93LmxvY2F0aW9uPSIvIjsKICAgICAgICB9CiAgICAgICAgZnVuY3Rpb24gSFRNTEVuY29kZShodG1sKQogICAgICAgIHsKICAgICAgICAgICAgdmFyIHRlbXAgPSBkb2N1bWVudC5jcmVhdGVFbGVtZW50ICgiZGl2Iik7CiAgICAgICAgICAgICh0ZW1wLnRleHRDb250ZW50ICE9IG51bGwpID8gKHRlbXAudGV4dENvbnRlbnQgPSBodG1sKSA6ICh0ZW1wLmlubmVyVGV4dCA9IGh0bWwpOwogICAgICAgICAgICB2YXIgb3V0cHV0ID0gdGVtcC5pbm5lckhUTUw7CiAgICAgICAgICAgIHRlbXAgPSBudWxsOwogICAgICAgICAgICByZXR1cm4gb3V0cHV0OwogICAgICAgIH0KICAgICAgICBkb2N1bWVudC5nZXRFbGVtZW50QnlJZCgid3VybDEiKS5hcHBlbmRDaGlsZChkb2N1bWVudC5jcmVhdGVUZXh0Tm9kZShIVE1MRW5jb2RlKGxvY2F0aW9uLmhyZWYpKSk7CiAgICA8L3NjcmlwdD4KPC9ib2R5Pgo8L2h0bWw+Cg==";
        return Html;
    }
    public static String getCode(){
        Code = "493";
        return Code;
    }
}