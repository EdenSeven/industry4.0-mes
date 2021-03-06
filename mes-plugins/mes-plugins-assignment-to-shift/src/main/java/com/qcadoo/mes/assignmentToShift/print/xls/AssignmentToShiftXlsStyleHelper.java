/**
 * ***************************************************************************
 * Copyright (c) 2018 RiceFish Limited
 * Project: SmartMES
 * Version: 1.6
 *
 * This file is part of SmartMES.
 *
 * SmartMES is Authorized software; you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation; either version 3 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * ***************************************************************************
 */
package com.qcadoo.mes.assignmentToShift.print.xls;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.stereotype.Service;

@Service
public class AssignmentToShiftXlsStyleHelper {

    public void setGreyDataStyleBorderTopAlignLeftBold(final HSSFSheet sheet, final HSSFCell cell) {
        cell.setCellStyle(getHeaderStyle(sheet.getWorkbook(), HSSFCellStyle.BORDER_MEDIUM, HSSFCellStyle.BORDER_NONE,
                HSSFCellStyle.BORDER_NONE, HSSFCellStyle.BORDER_NONE, HSSFCellStyle.ALIGN_LEFT, Font.BOLDWEIGHT_BOLD));
    }

    public void setGreyDataStyleBorderBottomAlignLeftBold(final HSSFSheet sheet, final HSSFCell cell) {
        cell.setCellStyle(getHeaderStyle(sheet.getWorkbook(), HSSFCellStyle.BORDER_NONE, HSSFCellStyle.BORDER_NONE,
                HSSFCellStyle.BORDER_NONE, HSSFCellStyle.BORDER_MEDIUM, HSSFCellStyle.ALIGN_LEFT, Font.BOLDWEIGHT_BOLD));
    }

    public void setGreyDataStyleAlignRightBold(final HSSFSheet sheet, final HSSFCell cell) {
        cell.setCellStyle(getHeaderStyle(sheet.getWorkbook(), HSSFCellStyle.BORDER_MEDIUM, HSSFCellStyle.BORDER_NONE,
                HSSFCellStyle.BORDER_NONE, HSSFCellStyle.BORDER_MEDIUM, HSSFCellStyle.ALIGN_RIGHT, Font.BOLDWEIGHT_BOLD));
    }

    public void setGreyDataStyleBorderTopLeftAlignLeftBold(final HSSFSheet sheet, final HSSFCell cell) {
        cell.setCellStyle(getHeaderStyle(sheet.getWorkbook(), HSSFCellStyle.BORDER_MEDIUM, HSSFCellStyle.BORDER_MEDIUM,
                HSSFCellStyle.BORDER_NONE, HSSFCellStyle.BORDER_NONE, HSSFCellStyle.ALIGN_LEFT, Font.BOLDWEIGHT_BOLD));
    }

    public void setGreyDataStyleBorderTopRightAlignLeftBold(final HSSFSheet sheet, final HSSFCell cell) {
        cell.setCellStyle(getHeaderStyle(sheet.getWorkbook(), HSSFCellStyle.BORDER_MEDIUM, HSSFCellStyle.BORDER_NONE,
                HSSFCellStyle.BORDER_MEDIUM, HSSFCellStyle.BORDER_NONE, HSSFCellStyle.ALIGN_LEFT, Font.BOLDWEIGHT_BOLD));
    }

    public void setGreyDataStyleBorderLeftBottomAlignLeftBold(final HSSFSheet sheet, final HSSFCell cell) {
        cell.setCellStyle(getHeaderStyle(sheet.getWorkbook(), HSSFCellStyle.BORDER_NONE, HSSFCellStyle.BORDER_MEDIUM,
                HSSFCellStyle.BORDER_NONE, HSSFCellStyle.BORDER_MEDIUM, HSSFCellStyle.ALIGN_LEFT, Font.BOLDWEIGHT_BOLD));
    }

    public void setGreyDataStyleBorderRightBottomAlignLeftBold(final HSSFSheet sheet, final HSSFCell cell) {
        cell.setCellStyle(getHeaderStyle(sheet.getWorkbook(), HSSFCellStyle.BORDER_NONE, HSSFCellStyle.BORDER_NONE,
                HSSFCellStyle.BORDER_MEDIUM, HSSFCellStyle.BORDER_MEDIUM, HSSFCellStyle.ALIGN_LEFT, Font.BOLDWEIGHT_BOLD));
    }

    public void setWhiteDataStyleBorderBoxAlignLeft(final HSSFSheet sheet, final HSSFCell cell) {
        cell.setCellStyle(getSeriesStyle(sheet.getWorkbook(), HSSFCellStyle.BORDER_THIN, HSSFCellStyle.BORDER_THIN,
                HSSFCellStyle.BORDER_THIN, HSSFCellStyle.BORDER_THIN, HSSFCellStyle.ALIGN_LEFT, Font.BOLDWEIGHT_NORMAL));
    }

    public void setWhiteDataStyleBorderBoxAlignCenter(final HSSFSheet sheet, final HSSFCell cell) {
        cell.setCellStyle(getSeriesStyle(sheet.getWorkbook(), HSSFCellStyle.BORDER_THIN, HSSFCellStyle.BORDER_THIN,
                HSSFCellStyle.BORDER_THIN, HSSFCellStyle.BORDER_THIN, HSSFCellStyle.ALIGN_CENTER, Font.BOLDWEIGHT_NORMAL));
    }

    public void setWhiteDataStyleBorderBoxAlignLeftBold(final HSSFSheet sheet, final HSSFCell cell) {
        cell.setCellStyle(getSeriesStyle(sheet.getWorkbook(), HSSFCellStyle.BORDER_THIN, HSSFCellStyle.BORDER_THIN,
                HSSFCellStyle.BORDER_THIN, HSSFCellStyle.BORDER_THIN, HSSFCellStyle.ALIGN_LEFT, Font.BOLDWEIGHT_BOLD));
    }

    public void setWhiteDataStyleBorderBoxAlignCenterBold(final HSSFSheet sheet, final HSSFCell cell) {
        cell.setCellStyle(getSeriesStyle(sheet.getWorkbook(), HSSFCellStyle.BORDER_THIN, HSSFCellStyle.BORDER_THIN,
                HSSFCellStyle.BORDER_THIN, HSSFCellStyle.BORDER_THIN, HSSFCellStyle.ALIGN_CENTER, Font.BOLDWEIGHT_BOLD));
    }

    private HSSFCellStyle getHeaderStyle(final HSSFWorkbook workbook, final short borderTop, final short borderLeft,
            final short borderRight, final short borderBottom, final short alignment, final short boldweight) {
        HSSFCellStyle style = workbook.createCellStyle();

        style.setBorderTop(borderTop);
        style.setBorderLeft(borderLeft);
        style.setBorderRight(borderRight);
        style.setBorderBottom(borderBottom);

        style.setAlignment(alignment);
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        style.setIndention((short) 3);
        style.setWrapText(true);

        style.setFillForegroundColor(HSSFColor.GREY_25_PERCENT.index);
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

        Font font = workbook.createFont();
        font.setFontName(HSSFFont.FONT_ARIAL);
        font.setFontHeightInPoints((short) 12);
        font.setBoldweight(boldweight);

        style.setFont(font);

        return style;
    }

    private HSSFCellStyle getSeriesStyle(final HSSFWorkbook workbook, final short borderTop, final short borderLeft,
            final short borderRight, final short borderBottom, final short alignment, final short boldweight) {
        HSSFCellStyle style = workbook.createCellStyle();

        style.setBorderTop(borderTop);
        style.setBorderLeft(borderLeft);
        style.setBorderRight(borderRight);
        style.setBorderBottom(borderBottom);

        style.setAlignment(alignment);
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        style.setWrapText(true);

        Font font = workbook.createFont();
        font.setFontName(HSSFFont.FONT_ARIAL);
        font.setFontHeightInPoints((short) 11);
        font.setBoldweight(boldweight);
        style.setFont(font);

        return style;
    }

    public void addMarginsAndStylesForAuthor(final HSSFSheet sheet, final int rowNumber, final int numberOfDays) {
        int firstColumnNumber = 0;
        int lastColumnNumber;
        int margin = 3;

        if (numberOfDays < 3) {
            lastColumnNumber = 10;
        } else {
            lastColumnNumber = (numberOfDays + 1) * margin;
        }

        for (int columnNumber = firstColumnNumber; columnNumber <= lastColumnNumber; columnNumber++) {
            if (sheet.getRow(rowNumber).getCell(columnNumber) == null) {
                sheet.getRow(rowNumber).createCell(columnNumber);
            }

            if (columnNumber == firstColumnNumber) {
                setGreyDataStyleBorderTopLeftAlignLeftBold(sheet, sheet.getRow(rowNumber).getCell(columnNumber));
            } else if (columnNumber == lastColumnNumber) {
                setGreyDataStyleBorderTopRightAlignLeftBold(sheet, sheet.getRow(rowNumber).getCell(columnNumber));
            } else {
                setGreyDataStyleBorderTopAlignLeftBold(sheet, sheet.getRow(rowNumber).getCell(columnNumber));
            }
        }

        sheet.addMergedRegion(new CellRangeAddress(rowNumber, rowNumber, firstColumnNumber, firstColumnNumber + margin - 1));
        sheet.addMergedRegion(new CellRangeAddress(rowNumber, rowNumber, firstColumnNumber + margin, firstColumnNumber
                + (margin * 2) - 1));
        sheet.addMergedRegion(new CellRangeAddress(rowNumber, rowNumber, firstColumnNumber + (margin * 2), lastColumnNumber));
    }

    public void addMarginsAndStylesForAuthorFactory(final HSSFSheet sheet, final int rowNumber, final int numberOfDays) {
        int firstColumnNumber = 0;
        int lastColumnNumber;
        int margin = 3;

        if (numberOfDays < 3) {
            lastColumnNumber = 10;
        } else {
            lastColumnNumber = (numberOfDays + 1) * margin;
        }

        for (int columnNumber = firstColumnNumber; columnNumber <= lastColumnNumber; columnNumber++) {
            if (sheet.getRow(rowNumber).getCell(columnNumber) == null) {
                sheet.getRow(rowNumber).createCell(columnNumber);
            }

            if (columnNumber == firstColumnNumber) {
                setGreyDataStyleBorderLeftBottomAlignLeftBold(sheet, sheet.getRow(rowNumber).getCell(columnNumber));
            } else if (columnNumber == lastColumnNumber) {
                setGreyDataStyleBorderRightBottomAlignLeftBold(sheet, sheet.getRow(rowNumber).getCell(columnNumber));
            } else {
                setGreyDataStyleBorderBottomAlignLeftBold(sheet, sheet.getRow(rowNumber).getCell(columnNumber));
            }
        }

        sheet.addMergedRegion(new CellRangeAddress(rowNumber, rowNumber, firstColumnNumber, lastColumnNumber));
    }

    public void addMarginsAndStylesForAssignmentToShift(final HSSFSheet sheet, final int rowNumber, final int numberOfDays) {
        int margin = 3;
        int firstColumn = 0;
        int lastColumn = (numberOfDays + 1) * margin;

        for (int columnNumber = firstColumn; columnNumber <= lastColumn; columnNumber++) {
            if (sheet.getRow(rowNumber).getCell(columnNumber) == null) {
                sheet.getRow(rowNumber).createCell(columnNumber);
            }

            setWhiteDataStyleBorderBoxAlignCenterBold(sheet, sheet.getRow(rowNumber).getCell(columnNumber));
        }

        for (int columnNumber = 1; columnNumber <= lastColumn; columnNumber += margin) {
            sheet.addMergedRegion(new CellRangeAddress(rowNumber, rowNumber, columnNumber, columnNumber + 2));
        }
    }

    public void addMarginsAndStylesForSeries(final HSSFSheet sheet, final int rowNumber, final int numberOfDays) {
        int margin = 3;
        int firstColumn = 0;
        int lastColumn = (numberOfDays + 1) * margin;

        for (int columnNumber = firstColumn; columnNumber <= lastColumn; columnNumber++) {
            if (sheet.getRow(rowNumber).getCell(columnNumber) == null) {
                sheet.getRow(rowNumber).createCell(columnNumber);
            }

            if (columnNumber == firstColumn) {
                setWhiteDataStyleBorderBoxAlignCenterBold(sheet, sheet.getRow(rowNumber).getCell(columnNumber));
            } else {
                setWhiteDataStyleBorderBoxAlignLeft(sheet, sheet.getRow(rowNumber).getCell(columnNumber));
            }
        }

        for (int columnNumber = 1; columnNumber <= lastColumn; columnNumber += margin) {
            sheet.addMergedRegion(new CellRangeAddress(rowNumber, rowNumber, columnNumber, columnNumber + 2));
        }
    }

    public int getHeightForRow(final int stringLength, final int inLine, final int points) {
        if (stringLength > inLine) {
            int rows = stringLength / inLine;
            int rest = stringLength % inLine;

            if (rest > 0) {
                rows++;
            }

            return rows * points;
        } else {
            return points;
        }
    }

}
